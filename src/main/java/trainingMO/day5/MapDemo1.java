package trainingMO.day5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class MapDemo1 {
public static void main(String[] args) {
HashMap<String, String> emp= new HashMap<String, String>();
emp.put("ID1","Sachin");
emp.put("ID2","Rohith");
emp.put("ID3","Virat");
emp.put("ID4","SKY");
emp.put(null,"Hardhik");
emp.put("ID5","Ravindra");
emp.put("ID6","kuladeep");

//System.out.println(emp.keySet()); //Keyset returns string since no duplicates

//System.out.println(emp.values()); //Values return collection string
for(Map.Entry<String, String> pair :emp.entrySet())
{//System.out.println(pair.getKey()+" : "+pair.getValue() );
}

  Iterator<Entry<String, String>> itr=  emp.entrySet().iterator();
  while(itr.hasNext())
  {
	 System.out.println( itr.next());
  }

	}

}
