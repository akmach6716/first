package trainingMO.day4;

public class ThisDemo {
	String empname="";
	
	public ThisDemo()
	{
		 this("Sachin") ;//this keyword is used to call another constructor
		System.out.println("Emp will be onboarded");
		System.out.println(0);
	}
	
	public ThisDemo(String name)
	{
		empname=name;
	}
	public void documentSub()
	{
		System.out.println(empname+" will submit the documents");
	}
	public static void main(String[] args) {
		
ThisDemo emp =new ThisDemo();
emp.documentSub();
	}

}
