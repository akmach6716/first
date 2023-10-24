package trainingMO.day4;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TreesetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts1= new  TreeSet<String>();
		ts1.add("Rahul");
		ts1.add("Virat");
	    ts1.add("Shreyas");
	    ts1.add("ravindra");
	    ts1.add("Ravindra");
	    ts1.add("Ajay");
	    ts1.add("Virat"); //Duplicates not added
	   // ts1.add(null); //Tree set wont accept null values
	  //Maintains Insertion order ,maintains alphabetical ascending order
	    System.out.println(ts1);
	
	
	}}
