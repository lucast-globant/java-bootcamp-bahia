package meetingPack;

import org.springframework.context.annotation.Bean;

public class RoomRepoConfig {

	
	@Bean
    public RoomRepository obtenerRoomRepository() {
        return new RoomRepository();
    }	
	
}
