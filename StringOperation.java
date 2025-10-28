package project1;
import java.util.Scanner; // importing Scanner class for user input
/*--- Creating a class for String Character related problems ----*/
import java.util.Scanner; //importing Scanner class for user input

/---------- Class for Character based operation -------------/
class StringCharacterOperation
{
	/*---- Method for counting number of vowels ----*/
	public static int countVowels(String data)
	/--- Method to count number of uppercase characters ---/
	public static int countUpperCase(String sentence)
{
		int vowels = 0;
		char character;
		for(int index = 0;index< data.length();index++)
		int upper = 0 ; // to count uppercase character
		char character; // to fetch the character
		for(int index = 0; index < sentence.length(); index++)
{
			character = data.charAt(index); //fetching character at given index from string
			if(character=='a' || character == 'A' || character == 'e' || character == 'E' || character =='i' ||
			character=='I' || character=='o' || character == 'O' || character=='u' || character == 'U')
			character = sentence.charAt(index); //extracted the character at given index
			if(character >= 'A' && character <= 'Z') //verifying uppercase character
{
				vowels++; //incrementing count of vowels
				upper++; //incrementing count of uppercase character
}
}
		return vowels;
		//return count of uppercase character
		return upper;
}

	/*---- Method for Counting number of uppercase characters -----*/
	public static int countUpperCaseCharacter(String data)
	/--- Method to count number of lowercase characters ---/
	public static int countLowerCase(String sentence)
{
		int upper = 0;
		char character;
		for(int index = 0;index< data.length();index++)
		int lower = 0 ; // to count lowercase character
		char character; // to fetch the character
		for(int index = 0; index < sentence.length(); index++)
{
			character = data.charAt(index); //fetching character at given index from string
			if(character >= 'A' && character <= 'Z') //verifying uppercase character
			character = sentence.charAt(index);//extracted the character at given index
			if(character >= 'a' && character <= 'z') //verifying lowercase character
{
				upper++;	//incrementing number of uppercase characters
				lower++; //incrementing count of lowercase character
}
}
		return upper;
		//return count of lowercase character
		return lower;
}

	/*---- Method for counting number of alphabets in given string ----*/
	public static int countAplhabet(String data)
	/--- Method for counting number of alphabets in the given string ----/
	public static int countAlphabet(String sentence)
{
		int alphabet = 0;
		//number of alphabets is equal to the number of uppercase character and lowercase character
		int alphabets = countUpperCase(sentence) + countLowerCase(sentence);
		//return this count
		return alphabets;
	}
	
	/--- Method for counting number of special characters in the given string ----/
	public static int countSpecialChars(String sentence)
	{
		//special characters are the characters other than alphabets in the sentence
		int specialchar = sentence.length() - countAlphabet(sentence);
		//return this count
		return specialchar;
	}
	
	/--- Method to count number of vowels in the given string ---/
	public static int countVowels(String sentence)
	{
		int vowels = 0; //to count vowels
char character;
		for(int index = 0;index< data.length();index++)
		for(int i = 0; i < sentence.length(); i++)
{
			character = data.charAt(index); //fetching character at given index from string
			if((character >= 'A' && character <= 'Z') || (character >='a' && character <='z'))
			character = Character.toLowerCase(sentence.charAt(i)); //convert to lowercase for easy comparison
			if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
{
				alphabet++;
				vowels++; //increment count if vowel found
}
}
		return alphabet;
		return vowels; //return total vowels
	}
	
	/--- Method to count number of consonants in the given string ---/
	public static int countConsonants(String sentence)
	{
		//Consonants = total alphabets - vowels
		int consonants = countAlphabet(sentence) - countVowels(sentence);
		return consonants;
}
}
/*------------------------------------------------------------------------------------*/
/*---- Initial class -----*/

/-------- Initial class ----------------------/
public class StringOperation {

public static void main(String[] args) {
		//creating string reference
		String sentence;
		//Creating object of Scanner class
		Scanner sc= new Scanner(System.in);
		//creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any sentence : ");
		String sentence = sc.nextLine();
		
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of characters : " + sentence.length());
		
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of uppercase characters: " + StringCharacterOperation.countUpperCase(sentence));
		
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of lowercase characters: " + StringCharacterOperation.countLowerCase(sentence));

		System.out.println("Enter any Sentence : ");
		sentence = sc.nextLine();
		System.out.println("--------------------------------------------------");
		System.out.println("No. of Vowels : "+StringCharacterOperation.countVowels(sentence));
		System.out.println("No. of Uppercase characters : "+StringCharacterOperation.countUpperCaseCharacter(sentence));
		System.out.println("No. of Alphabets : "+StringCharacterOperation.countAplhabet(sentence));
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Alphabets: " + StringCharacterOperation.countAlphabet(sentence));
		
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Special characters: " + StringCharacterOperation.countSpecialChars(sentence));
		
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Vowels: " + StringCharacterOperation.countVowels(sentence));
		
		System.out.println("------------------------------------------------------");
		System.out.println("Total Number of Consonants: " + StringCharacterOperation.countConsonants(sentence));
		
		System.out.println("------------------------------------------------------");
		
		sc.close();
}

}
