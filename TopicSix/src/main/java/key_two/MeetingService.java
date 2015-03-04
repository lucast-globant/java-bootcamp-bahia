package key_two;

import java.util.List;

public interface MeetingService {

	public Meeting create(Meeting meeting);

	public void cancel(Long id);

	public List<Meeting> getAll();

	public Meeting update(Meeting meeting);
}
