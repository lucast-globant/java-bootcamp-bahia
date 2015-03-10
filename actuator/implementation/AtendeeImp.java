package topic6.actuator.implementation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import topic6.actuator.entities.Atendee;
import topic6.actuator.entities.Database;
import topic6.actuator.interfaces.AtendeeService;
@Service
@Component
public class AtendeeImp implements AtendeeService {
	@Autowired
    Database db = Database.getInstance();

	@Override
	public String toString() {
		return db.getAtendees().toString();
	}

	@Override
	public Atendee add(Atendee atendee) {
		return db.put(atendee);
	}

	public Atendee getAtendee(Integer idAtendee) {
		return db.getAtendee(idAtendee);
	}

	public List<Atendee> getAtendees() {
	
		return db.getAtendees();
	}

}
