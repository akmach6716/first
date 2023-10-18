package javaPrograms;
import java.util.HashSet;
import java.util.Set;
public class DuplicateelementsinArray {
	public static void main(String[] args) {	
		//String s[]= new String [4];
		String s[]= {"Ravindra", "Bangalore","Hyderabad","Chennai","jaipur","Pune", "Hyderabad","Bangalore","jaipur","Agra"};
		System.out.println("Duplicate Elements in the array are ");
    System.out.println("Brute Force logic   ******************************************");    
		for (int i=0; i<s.length;i++)       {    	   for (int j=i+1; j<s.length;j++)
    	   {     		  if (s[i].equalsIgnoreCase(s[j]))
    		  {    			    System.out.println(s[i]); }    	   }       }		
		 System.out.println("Hashset   ******************************************");  		 
		 Set<String> data= new  HashSet<String>();		 
		 for(String e:s)
		 {		 if (data.add(e) ==false) { System.out.println(e);}
		 }
		 System.out.println("Hassmap  ******************************************");  	 
		 
		 
		 

	}

}
