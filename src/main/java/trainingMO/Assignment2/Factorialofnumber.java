package trainingMO.Assignment2;

public class Factorialofnumber {

	public static void main(String[] args) {
		factorial(6);

	}
public static void factorial(int n)
{long fact=1;
	for(int i=1; i<=n;i++)
	{
		
		fact=fact*i;
	}
	System.out.println("factorial of the number "+n+" is : "+fact);
	
	}
}
