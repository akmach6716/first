package javaPrograms;

public class StringObjectsCheck {

	public static void main(String[] args) {
		String s1= "Demo";
		String s2= new String("Demo");
		System.out.println(s1==s2);		
		
		String s3= "Demo";
		String s4= "Demo";
System.out.println(s3==s4);
System.out.println(s2==s3);
	}

}
