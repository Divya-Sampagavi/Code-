package calling;

import stringhandling.CheckStringPalindrome;
import stringhandling.CompareFirstCharacters;
import stringhandling.CompareLastCharacters;
import stringhandling.CompareStringSpaces;
import stringhandling.ConcatenateAndLength;
import stringhandling.FindSpacesInString;
import stringhandling.StringReverse;
import stringhandling.WordsInString;


public class CallMethods {

	public static void main(String[] args) {
	
			
		StringReverse str = new StringReverse();
		System.out.println("**** Reverse String Solution 1 ***********************");
		str.reverseStringApproach1("Testing the solution");
		System.out.println("**** Reverse String Solution 2 ***********************");
		str.reverseStringApproach2("Testing");
		System.out.println("======================================================");
		
		CheckStringPalindrome palindrome = new CheckStringPalindrome();
		palindrome.checkStringPalindrome("Testing");
		palindrome.checkStringPalindrome("malayalam");
		
		System.out.println("======================================================");
		ConcatenateAndLength len = new ConcatenateAndLength();
		len.concatenateGetLength("Testing", "World");
		
		System.out.println("======================================================");
		WordsInString wor = new WordsInString();
		wor.findWordsInString("This is Testing World");
		
		System.out.println("======================================================");
		CompareStringSpaces comp1 = new CompareStringSpaces();
		comp1.compareStringwithSpaces("Testing ", " Testing");
		
		System.out.println("======================================================");
		FindSpacesInString space = new FindSpacesInString();
		space.findAndRemoveSpacesinString("This is Testing World");
	
		System.out.println("======================================================");
		CompareLastCharacters charac = new CompareLastCharacters();
		charac.compareLast10Characters("TestingHello", "WorldTesting");
		charac.compareLastNCharacters("TestingHello", "WorldTesting",8);
		
		System.out.println("======================================================");
		CompareFirstCharacters comp = new CompareFirstCharacters();
		comp.compareFirst10Characters("This is Testing World", "This is Testing World");
		comp.compareFirstNCharacters("This is Testing World", "This is Testing World",8);
		
	}
	
}
