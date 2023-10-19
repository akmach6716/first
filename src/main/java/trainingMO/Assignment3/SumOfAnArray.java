package trainingMO.Assignment3;

public class SumOfAnArray {

	public static void main(String[] args) {
	int [] array= {11, 22, 33, 44, 555,100};
	int sum=0;
	for(int i=0;i<array.length;i++)
	{
		sum= sum+array[i];
	}
System.out.println("sum of the elements in the array is : "+sum);
	}

}
