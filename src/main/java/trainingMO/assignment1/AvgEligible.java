package trainingMO.assignment1;
public class AvgEligible {
	public static void main(String[] args) {
	/*average(10, 20, 30) ;
	average(50,150,10);
	average(0,0,0);	
	average(20,-40,-40);*/
		avgvariable(20,30,40,10);
		avgvariable(12,13,14,15);
	}
	public static void average(int a,int b,int c)
	{
	double avg = (a+b+c)/3;
		System.out.println("Average of the given number  is : "+avg);
		if (avg>0 && avg<50)
		{
			System.out.println(avg+" not elegible");
		}
		if (avg>=50)
		{
			System.out.println(avg+" :Elegible");
		}
		if (avg==0)
		{
			System.out.println(avg+" :Please try again");
		}
		if(avg<0)
		{
			System.out.println(avg+" :given num is negative number");
		}
	}
	//Average using vairable arguments
	public static void avgvariable(int ...value)
	{
		int arglnth= value.length;
		double sum=0;
		for(int i=0;i<arglnth;i++)
		{
		sum= sum+value[i];
		}
		double avg=sum/arglnth;
		System.out.println("Average is  :  "+avg);
	}

}
