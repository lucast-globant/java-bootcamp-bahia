package key_two;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.io.IOException;
import java.nio.charset.Charset;
import java.sql.Time;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * @author Josh Long
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TopicSixApplication.class)
@WebAppConfiguration
public class RestServiceTest {

	private MediaType contentType = new MediaType(
			MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

	private MockMvc mockMvc;
	@SuppressWarnings("rawtypes")
	private HttpMessageConverter mappingJackson2HttpMessageConverter;
	private List<Attendee> attendees = new LinkedList<Attendee>();
	private Room room1;
	private Room room2;

	@Autowired
	private MeetingService meetingService;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Autowired
	private AttendeeRepository attendeeRepository;

	@Autowired
	private RoomRepository roomRepository;

	@Autowired
	void setConverters(HttpMessageConverter<?>[] converters) {

		this.mappingJackson2HttpMessageConverter = Arrays
				.asList(converters)
				.stream()
				.filter(hmc -> hmc instanceof MappingJackson2HttpMessageConverter)
				.findAny().get();

		Assert.assertNotNull("the JSON message converter must not be null",
				this.mappingJackson2HttpMessageConverter);
	}

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();

		room1 = roomRepository.save(new Room("Room One"));
		room2 = roomRepository.save(new Room("Room Two"));

		attendees.add(attendeeRepository.save(new Attendee("Roman")));
		attendees.add(attendeeRepository.save(new Attendee("Leo")));
		attendees.add(attendeeRepository.save(new Attendee("Daniel")));
		attendees.add(attendeeRepository.save(new Attendee("Walter")));

	}

	@Test
	public void getAllMeetingsTest() throws Exception {
		Meeting meeting = new Meeting(room1, attendees, new Time(20));
		meetingService.create(meeting);
		mockMvc.perform(get("/meetings")).andExpect(status().isOk());
	}

	@Test
	public void createMeetingTest() throws Exception {
		String meetingJson = json(new Meeting(room1, attendees, new Time(20)));
		System.out.println(meetingJson);
		this.mockMvc
				.perform(
						post("/meetings").contentType(contentType).content(
								meetingJson)).andExpect(status().isCreated());
	}

	@Test
	public void create2MeetingTest() throws Exception {
		Meeting meeting = new Meeting(room2, attendees, new Time(20));
		String meetingJson = json(meeting);
		System.out.println(meetingJson);
		this.mockMvc
				.perform(
						post("/meetings").contentType(contentType).content(
								meetingJson)).andExpect(status().isCreated());

	}

	@SuppressWarnings("unchecked")
	protected String json(Object o) throws IOException {
		MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
		this.mappingJackson2HttpMessageConverter.write(o,
				MediaType.APPLICATION_JSON, mockHttpOutputMessage);
		return mockHttpOutputMessage.getBodyAsString();
	}
}