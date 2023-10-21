package trainingMO.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SettoList {

	public static void main(String[] args) {
		// To access the set alements using index we have to convert set to list
		
		Set<String> s1= new HashSet<String>();
		s1.add("Cricket");
		s1.add("Cricket");
		s1.add("Foot ball");
		s1.add("Hockey");
		s1.add("Basketball");
		//List<String> l1 = new ArrayList<String>();
		//l1.addAll(s1);
		List<String> l1 = new ArrayList<String>(s1);
		System.out.println(l1);
	}

}
