package topic6.entities;

public class Attendee {
	
	private String name;
	private long phoneNumber;
	private long dni;
	
	public Attendee () {}
	
	public Attendee(String name, long phoneNumber, long dni) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.dni = dni;
	}
	
	public String getName() {
		return name;
	}
	
	public Attendee setName(String name) {
		this.name = name;
		return this;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public Attendee setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public long getDni() {
		return dni;
	}
	
	public Attendee setDni(long dni) {
		this.dni = dni;
		return this;
	}
	
	public Attendee copyFrom(Attendee attendee) {
		 if (attendee != null) {
			 this.name = attendee.name;
			 this.phoneNumber = attendee.phoneNumber;
			 this.dni = attendee.dni;
		 }
		 return this;
	 }	
}
