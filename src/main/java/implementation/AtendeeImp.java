package implementation;

import interfaces.AtendeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entities.Database;


@Component
public class AtendeeImp implements AtendeeService {
	@Autowired
	Database db = Database.getInstance();

	@Override
	public String toString() {
		return db.getAtendees().toString();
	}

}
