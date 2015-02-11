package topic0.excercise3;

public class Hospital {

	public static void main(String[] args) {

		Doctor d1 = new Doctor (1,true,"Jose","Paredes","12/03/2976","paredesj@gmail.com",4323233),
				d2 = new Doctor (2,true,"Juan","Streddre","12/03/2976","juan@gmail.com",5523233);
		
		Pacient p1 = new Pacient (1,true,"Luisa","Midrel","01/07/1944","",45323232),
				p2 = new Pacient (2,true,"Marta","Perez","21/11/1982","",4555532); 
		
		MedicalOffice o1 = new MedicalOffice ("Favaloro",1,true),
				o2 = new MedicalOffice ("Glasman",2,true);
		
		Appointment a1 = new Appointment (o1,d2,p1,"15/03/2015"),
				a2 = new Appointment (o2,d1,p2,"27/02/2015");
		
		System.out.println (a1.toString()+" - " +a2.toString());
	}
	

}
