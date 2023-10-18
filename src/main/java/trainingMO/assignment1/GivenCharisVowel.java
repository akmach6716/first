package trainingMO.assignment1;

public class GivenCharisVowel {

	public static void main(String[] args) {
		vowelorconso('i');
		vowelorconso('v');
		}

	public static void vowelorconso(char c) 
	{
		if( c=='a'||c=='A'|| c=='e'|| c=='E' ||c=='i'|| c=='I'|| c=='o'||c=='O'|| c=='u'||c=='U')
		{
			System.out.println("given character is vowel");
		}	else {System.out.println("given character is consonant"); }
		
	}
}
