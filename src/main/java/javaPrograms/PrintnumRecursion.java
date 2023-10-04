package javaPrograms;

public class PrintnumRecursion {

	public static void main(String[] args) {
		//printNum(0);
		printnumRange(0, 7);
	}	
	public static void printNum(int num)
	{		if (num<=100)
		{  System.out.println(num); 
			num++;
			printNum(num);			
		}
	}
	
	public static void printnumRange(int startnum , int endnum)
	{
		if (startnum<=endnum)
		{
			System.out.println(startnum);
			startnum++;
			printnumRange(startnum, endnum);
			
		}
	}

}
