package meetingPack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Main {

	@Bean
    public MeetingRepository getMeetingRepository() {
        return new MeetingRepository();
    }

	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}