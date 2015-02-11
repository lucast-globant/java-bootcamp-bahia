
public class Building {

	public static void main(String[] args) {
		House h1 = new House(); 
		h1.setWall("brick");
		h1.setRoof("ceiling");
		h1.setFloor("wood");
		System.out.println("The wall is "+h1.getWall()+", the roof is "+h1.getRoof()+" and the floor is "+h1.getFloor());
		
		Builder b1 = new Builder();
		b1.setLastName("Midi");
		b1.setName("William");
		b1.setDni(15698745);
		b1.setEmail("mWilliam@gmail.com");
		System.out.println("The builder of the House is "+b1.getLastName()+", "+b1.getName()+". His mail is "+b1.getEmail()+" and his DNI is "+b1.getDni());
	}
}