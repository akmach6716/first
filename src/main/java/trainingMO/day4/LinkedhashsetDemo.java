package trainingMO.day4;

import java.util.LinkedHashSet;

public class LinkedhashsetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lh1= new LinkedHashSet<String>();
		lh1.add("Rahul");
		lh1.add("Virat");
	    lh1.add("Shreyas");
	    lh1.add("ravindra");
	    lh1.add("Ravindra");
	    lh1.add("Virat"); //Duplicates not added
	    lh1.add(null);
	    lh1.add("ravindra");
	    System.out.println(lh1);
		
	}

}
