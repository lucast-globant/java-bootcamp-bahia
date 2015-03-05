package topic6.actuator.interfaces;

import java.util.List;

import org.springframework.stereotype.Component;

import topic6.actuator.entities.Atendee;

@Component
public interface AtendeeService {
	
	public Atendee add(Atendee atendee);
	public Atendee getAtendee(Integer idAtendee);
	public List<Atendee> getAtendees();

}
