package recentList;

import java.io.File;



public class RecentList {
	
	protected File[] recentOpened;
	private int lenght;
	private int lastIndex;

	
	public RecentList(){
		recentOpened=new File[15];
		lenght=15;
		lastIndex=-1;
	}
	
	public RecentList(int i) {
		recentOpened=new File[i];
		lenght=i;
		lastIndex=-1;
	}

	public boolean empty() {
		return lastIndex<0;
	}
	
	public boolean full(){
		return (lastIndex+1)==lenght;
	}

	public int getActualSize() {
		return lastIndex+1;
	}

	public void openFile(File f1) {
		if(!isRecentOpened(f1)){
			if(!full()){
				recentOpened[++lastIndex]=f1;
				
					
				
			}else{
				for(int i=0; i<(lastIndex); i++){ //all indexes, array is full
					
					recentOpened[i]=recentOpened[i+1]; //move elements to left
				
				}
				recentOpened[lastIndex]=f1;
			}
		}else{
//			log();
			remove(f1);
			recentOpened[++lastIndex]=f1;
			
		}
		
	}

	private void remove(File f1) {
		int index=getIndex(f1);
		if(index!=-1){
			for(int i=index; i<(lastIndex); i++){
			
				recentOpened[i]=recentOpened[i+1]; //move elements to left
			
			}
			lastIndex--;
		
		}
		
	
		
	}
	
	public int getIndex(File t) {
		int i=0;
		
		for (File e : recentOpened) {
			
			if(e.equals(t))
				return i;
			i++;	
		}
		return -1;
		
	}

	public boolean isRecentOpened(File f1) {
		if(!empty())
			for (File file : recentOpened) {
				if(file!=null && file.equals(f1)) //is already in the list
					return true;
			}
		return false;
	}
	

	public File lastOpened(){
		if(!empty())
			return recentOpened[lastIndex];
		else
			return null;
	}


	
	
	

}
