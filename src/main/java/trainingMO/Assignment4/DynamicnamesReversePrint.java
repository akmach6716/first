package trainingMO.Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class DynamicnamesReversePrint {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("How many students you want to enter");
		 int size=sc.nextInt();	
		
		ArrayList<String > input = new ArrayList<String>();
		for(int i=0; i<size;i++)
		{
	       System.out.println("Enter a name ");
		    input.add(sc.nextLine());
		}
		System.out.println(input);
	 
	

	}

}
