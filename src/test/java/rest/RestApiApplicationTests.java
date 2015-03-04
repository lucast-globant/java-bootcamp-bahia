package rest;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestApiApplication.class)
@WebAppConfiguration
public class RestApiApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;    
    private HttpMessageConverter mappingJackson2HttpMessageConverter;    
    private Room room;    
    private List<Attendee> attendees = new ArrayList<Attendee>();    
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private MeetingService meetingService;    
    @Autowired
    private WebApplicationContext webApplicationContext;
    @Autowired
    private AttendeeRepository attendeeRepository;
    @Autowired
    
    void setConverters(HttpMessageConverter<?>[] converters) {

        this.mappingJackson2HttpMessageConverter = Arrays.asList(converters).stream().filter(
                hmc -> hmc instanceof MappingJackson2HttpMessageConverter).findAny().get();

        Assert.assertNotNull("the JSON message converter must not be null",
                this.mappingJackson2HttpMessageConverter);
    }
	
    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
        
        this.roomRepository.deleteAllInBatch();
        this.attendeeRepository.deleteAllInBatch();
        
        roomRepository.save(new Room("Habitacion 1",100));
        room = roomRepository.save(new Room("Habitacion 2",50));
        roomRepository.save(new Room("Habitacion 3",25));
        
        attendees.add(attendeeRepository.save(new Attendee("Pedro")));
        attendees.add(attendeeRepository.save(new Attendee("Juan")));
        attendees.add(attendeeRepository.save(new Attendee("Jose")));
                
    }
    
	@Test
	public void createMeeting() throws Exception {
		String meetingJson = json (new Meeting(room,attendees,2));
		this.mockMvc.perform(post("/api/meetings")
                .contentType(contentType)
                .content(meetingJson))
                .andExpect(status().isCreated());
	}
	
	@Test
	public void getMeetings() throws Exception {
		Meeting meeting = meetingService.create(new Meeting(room,attendees,2));
		mockMvc.perform(get("/api/meetings"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(contentType));
	}
	
	protected String json(Object o) throws IOException {
        MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
        this.mappingJackson2HttpMessageConverter.write(o, MediaType.APPLICATION_JSON, mockHttpOutputMessage);
        return mockHttpOutputMessage.getBodyAsString();
    }

}