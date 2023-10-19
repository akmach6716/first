package trainingMO.Assignment3;
public class ReverseArray {
	public static void main(String[] args) {
		int [] arr= { 100, 2, 30, 4, 50 };
		int j= arr.length;
		int [] rev = new int [j];
		for(int i=0;i<arr.length;i++)
		{
			rev[j-1]=arr[i];
			j=j-1;
		}
		System.out.println("reversed array below is :::::::::::::::::::::::::::::::::::::::");
		for(int k=0;k<rev.length;k++)
		{
			System.out.println(rev[k]);
		}
	

	}

}
