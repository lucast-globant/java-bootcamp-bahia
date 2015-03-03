package meetingPack;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MeetingsController {
	
	@Autowired
	MeetingRepository meetingRepository;
    
    @RequestMapping(value="/meeting/{meetingId}", method = RequestMethod.GET)
	public  @ResponseBody Meeting getMeeting(@PathVariable String meetingId) {
		int index=Integer.parseInt(meetingId);		
		return meetingRepository.getAMeeting(index);

	}

    @RequestMapping(value="/meetings",method=RequestMethod.GET)
    public @ResponseBody MeetingRepository allMeetings() {
        return meetingRepository;
    }
    
   
    @RequestMapping(value = "/addMeeting",
			method = RequestMethod.POST,
			headers = "Accept=application/xml, application/json",
			produces="application/json")
	public @ResponseBody Meeting addMeeting(@RequestBody Meeting meeting){
    	meetingRepository.addMeeting(meeting);
			return meeting;
	}
    
    @RequestMapping(value = "/cancelMeeting",
			method = RequestMethod.DELETE,
			headers = "Accept=application/xml, application/json",
			produces="application/json")
	public void removeMeeting(@RequestBody int meeting){
    	meetingRepository.removeMeeting(meeting);
			
	}
    
    @RequestMapping(value = "/updateMeeting",
			method = RequestMethod.PUT,
			headers = "Accept=application/xml, application/json",
			produces="application/json")
	public @ResponseBody Meeting updateMeeting(@RequestBody Meeting meeting){
    	meetingRepository.updateMeeting(meeting);
			return meeting;
	}
    
}