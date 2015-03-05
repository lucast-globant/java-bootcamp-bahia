package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
    public MeetingRepository getMeetingRepository() {
        return new MeetingRepository();
    }
	
	@Bean
    public RoomRepository obtenerRoomRepository() {
        return new RoomRepository();
    }
}
