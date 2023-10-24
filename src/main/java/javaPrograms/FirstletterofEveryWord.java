package javaPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
public class FirstletterofEveryWord {
	public static void main(String[] args) {
	String s="Let us find the first letter of every word";
	 java.util.List<String> wordlist=Arrays.asList(s.split("\\s"));
	 System.out.println("First letter of every word in the sentence");
	for(String letter:wordlist)
	{
		System.out.println(letter.charAt(0));
	}

	}

}
