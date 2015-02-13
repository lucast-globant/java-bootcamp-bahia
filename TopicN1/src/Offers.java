import java.util.ArrayList;
import java.util.List;


public class Offers {

	private List<Offer> offersList;
	
	public Offers(){
		offersList= new ArrayList<Offer>();
	}
	
	public void addOffer(Offer O){
		offersList.add(O);
	}
	
	public void removeOffer(Offer O){
		offersList.remove(O);
	}
	
	public Offer getOffer(int index){
		return offersList.get(index);
	}
		
	public int numberOfOffers(int index){
		return offersList.size();
	}
	
	public void showOffers(){
		for(Offer offer : offersList){
	    	offer.show();	    		
	    }
	}
}
