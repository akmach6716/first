package javaPrograms;

public class NullArgument {

	public static void main(String[] args) {
		test(null);
	}
public static void test(Object O)
{
	System.out.println("in object Argument");
	}
public static void test(String s)
{
	System.out.println("in String  Argument");
	}
}

