package meetingPack;

import org.springframework.context.annotation.Bean;

public class MeetingRepoConfig {
	@Bean
    public MeetingRepository getMeetingRepository() {
        return new MeetingRepository();
    }
}
