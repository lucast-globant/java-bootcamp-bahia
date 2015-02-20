import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class RecentItems {
	 private List<String> m_items = new ArrayList<String>();
	 static final int m_maxItems=15;
	 
	 
	 String name = "fichero.txt";
	 
	 public RecentItems() {
		 String sCadena;
		 try{
		 FileReader fr = new FileReader("C:/Users/martin/Documents/"+name);
		 BufferedReader bf = new BufferedReader(fr);
		 
		 while ((sCadena = bf.readLine())!=null) {			   
			   openFile(sCadena);
			}
		 
		 bf.close();
		 
		 }catch(Exception ex){
		      ex.printStackTrace();
		    }
		 
		 
	 }
	
	
	public void openFile(String item)
    {
        m_items.remove(item);
        m_items.add(0, item);
        
        if (m_items.size() > m_maxItems)
        {
            m_items.remove(m_items.size() - 1);
        }
        
        
    }
	
	public int size(){
		return m_items.size();
	}
	
	public String get(int index)
    {
        return m_items.get(index);
    }
	
	public void showItems(){
		Iterator iter = m_items.iterator();
		while (iter.hasNext())
		  System.out.println(iter.next());
		
	}
	
	public void updateFile(){
		try{

		      FileWriter fichero = new FileWriter("C:/Users/martin/Documents/"+name);


		      Iterator iter = m_items.iterator();
			  while (iter.hasNext())
				  fichero.write(iter.next() + "\r\n");


		      fichero.close();

		    }catch(Exception ex){
		      ex.printStackTrace();
		    }
	}
}
