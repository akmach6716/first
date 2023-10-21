package trainingMO.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListtoSet {

	public static void main(String[] args) {
		ArrayList<String > l1= new ArrayList<String>();
		l1.add("Selenium");
		l1.add("Java");
		l1.add("Selenium");
		l1.add("testNG");
		l1.add("Jenkins");
		System.out.println(l1);
		Set<String> hs= new HashSet<String>();
		hs.addAll(l1);
		System.out.println(hs);
	}

}
