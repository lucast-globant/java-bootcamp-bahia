package key3;

public class Privado extends Hospital {

	public String getRepresentation(){
		return ("building a Private hospital");
	}

	public void registerGuest() {
		// TODO Auto-generated method stub
		for (Sector sector : sectors) {
			if(	sector.registerGuest() )
				break;
		}
	}

	
}
