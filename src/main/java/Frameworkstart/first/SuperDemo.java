package Frameworkstart.first;
 class A
{	 public A()
	 {
		 System.out.println("In A'");
	 }	 
	 public A(int i )
	 {
		 System.out.println("In A int ");
	 }	}
class B extends A
{	public B()
	{
		System.out.println("In B'");
	}
	 public B(int i )
	 { 
 //super method will inherit the corresponding constructor from parent class instead of default constructor.
//in the below example where super method is specified with pareamters ,hence this method inherits the constructor with int paramter from parentclass 
//instead of default constructor.		 
		 super(i);
		 System.out.println("In B int ");
	 }	}
public class SuperDemo {
	public static void main(String[] args) {		
	B objB =  new B();  
	B ObjB1= new B(23);
}}

