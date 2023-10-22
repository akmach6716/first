package trainingMO.Assignment4;
import java.util.ArrayList;
import java.util.Scanner;
public class DynamicnamesReversePrint {
	public static void main(String[] args) {
		 Scanner sc1= new Scanner(System.in);
		 ArrayList<String > input = new ArrayList<String>();
		 System.out.println("How many students you want to enter");
		 int size=sc1.nextInt();	
		 //getting the input
		 Scanner sc2= new Scanner(System.in);	
		System.out.println("Enter a name ");
		for(int i=0; i<size;i++)
		{   			
			    input.add(sc2.nextLine());
		    
		}
		//Print the list in reverse order
		for(int j= input.size()-1;j>=0;j--)
		{
			  System.out.println( input.get(j));
			
		    }	}}
