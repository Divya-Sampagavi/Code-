package stringhandling;

public class WordsInString {

	public void findWordsInString(String inputString){
		String []words  = inputString.split(" ");
		System.out.println("Number of Words in given String are : - " + words.length);
	}
	
}
