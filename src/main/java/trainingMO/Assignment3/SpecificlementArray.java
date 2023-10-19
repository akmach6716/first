package trainingMO.Assignment3;

public class SpecificlementArray {

	public static void main(String[] args) {
		int[] array = {11, 22, 35, 48, 60};
		int target=60;
		boolean found=false;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==target)
			{
				found=true;
				break;
			}
		}
System.out.println(found);
	}

}
