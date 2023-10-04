package javaPrograms;

public class BlockHierarchy {
static { System.out.println("This is static block");}
{System.out.println("This is instance initiation block");}

public BlockHierarchy()
{System.out.println("This is constructor");}
 
	public static void main(String[] args) {
		System.out.println("This is main method");
		BlockHierarchy bh= new BlockHierarchy();

	}

}
