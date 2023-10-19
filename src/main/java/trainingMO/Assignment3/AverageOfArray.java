package trainingMO.Assignment3;

public class AverageOfArray {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 41, 50};
			float sum=0;
			float avg=0;
			for(int i=0;i<arr.length;i++)
			{
				sum= sum+arr[i];
			}
			
		avg=sum/arr.length;
		System.out.println("Average is : "+avg);

	}

}
