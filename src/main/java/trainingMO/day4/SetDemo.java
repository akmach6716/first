package trainingMO.day4;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetDemo {
	public static void main(String[] args) {
		//no index , no duplicate, no random access
		HashSet< String > hs1= new HashSet<String>();
		hs1.add("Sachin");
		hs1.add("Sourav");
		hs1.add("Rohit");
		hs1.add("Shubman");
		hs1.add(null);		
		//System.out.println(hs1);		System.out.println(hs1.isEmpty());
		for(String str:hs1)
		{
			//System.out.println(str);
		}
Iterator<String>itr1=hs1.iterator();
while(itr1.hasNext())
{
      System.out.println(itr1.next());	
}

	}

}
