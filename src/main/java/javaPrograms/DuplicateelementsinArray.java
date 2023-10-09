package javaPrograms;
public class DuplicateelementsinArray {
	public static void main(String[] args) {	
		//String s[]= new String [4];
		String s[]= {"Ravindra", "Bangalore","Hyderabad","Chennai","Pune", "Hyderabad","Bangalore"};
		System.out.println("Duplicate Elements in the array are ");
       for (int i=0; i<s.length;i++)
       {
    	   for (int j=i+1; j<s.length;j++)
    	   { 
    		  if (s[i].equalsIgnoreCase(s[j]))
    		  {
    			    System.out.println(s[i]);
    		  }
    	   }
       }

	}

}
