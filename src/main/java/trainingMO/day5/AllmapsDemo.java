package trainingMO.day5;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class AllmapsDemo {
	public static void main(String[] args) {
		HashMap<String, String> hm1= new HashMap<String, String>();
		LinkedHashMap<String, String> lhm1= new LinkedHashMap<String, String>();
		TreeMap<String, String> tm1= new TreeMap<String, String>();
		hm1.put("ID1","Sachin");
		hm1.put("ID2","Rohith");
		hm1.put("ID3","Virat");
		hm1.put("ID4","SKY");
		hm1.put(null,"Hardhik");
		
		lhm1.put("ID1","Sachin"); //Linked hashmap follows insertion order of the Keys
		lhm1.put("ID4","SKY");
		lhm1.put("ID2","Rohith");
		lhm1.put("ID3","Virat");		
		lhm1.put(null,"Hardhik");
		
		tm1.put("ID1","Sachin");
		tm1.put("ID2","Rohith");
		tm1.put("ID3","Virat");
		tm1.put("ID4","SKY");
		//tm1.put(null,"Hardhik"); Treemap wont accept null values
		
		System.out.println("hashmap : "+hm1);
		System.out.println("Linked hashmap : "+lhm1);
		System.out.println("Tree map : "+tm1);

	}

}
