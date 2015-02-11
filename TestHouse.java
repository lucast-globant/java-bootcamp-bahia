package topic0.excercise2;

public class TestHouse {

	public static void main(String[] args) {
		
		Location l1 = new Location ("Bahia Blanca",8000,"Mitre",518,"dpto 2");
		Person p1 = new Person ("carlos","garcia","12/03/1942","cgarcia@gmail.com",4553765);
		House h1 = new House (p1,3,2,2,true,false,l1);
		
		System.out.println(h1.toString());
	}

}
