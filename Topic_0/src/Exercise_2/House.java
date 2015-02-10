package Exercise_2;

public class House {
	private String address;
	private int price;
	private Floor [] floors;
	private Garden garden;
	
	public void setAddress(String a){
		address = a;
	}
	
	public void setPrice(int p){
		price = p;
	}
	
	public void setFloors(Floor [] f){
		floors = f;
	}
	
	public void setGarden(Garden g){
		garden = g;
	}
	
	public String toString(){
		String s = "";
		s += "\tAddress: "+address+"\n";
		s += "\tPrice: "+price+"\n";
		for(int i = 0; i < floors.length; i++){
			s += "\tFloor "+i+":\n"+floors[i].toString()+"\n";
		}
		if(garden != null) s += "\t"+garden.toString();
		else s += "\tWithout garden";
		return s;
	}
	
}
