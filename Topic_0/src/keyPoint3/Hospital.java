package keyPoint3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hospital {
	private String name;
	private List<Area> areas;
	
	public Hospital() {
		areas = new ArrayList<Area>();
	}

	public void addArea(Area area) {
		this.areas.add(area);
	}
	
	public void setName(String name){
		this.name=name;
	}

	public String getName() {
		return this.name;
	}
	
	
	public String toString(){
		String output = name + "\n";
		Iterator<Area> iteratorAreas = areas.iterator();

		while(iteratorAreas.hasNext()){
		  Area anArea = iteratorAreas.next();
		  output = output.concat(anArea.description() + "\n");
		}
		return(output.concat("\n=============================\n"));
	}
}
