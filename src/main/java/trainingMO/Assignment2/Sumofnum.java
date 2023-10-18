package trainingMO.Assignment2;

public class Sumofnum {

	public static void main(String[] args) {
		sum(100);
	}
	public static void sum(int x)
	{
		int sum=0;
		for( int i=0;i<x;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum from 1 to "+x+" is :"+sum);
		
	}

}
