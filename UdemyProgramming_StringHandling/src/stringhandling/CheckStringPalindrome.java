package stringhandling;

public class CheckStringPalindrome {
	
	public void checkStringPalindrome(String inputString){
		String outputString = "";
		for(int i=inputString.length()-1;i>=0;i--){
			outputString = outputString+ inputString.charAt(i);
		}

		if(inputString.equalsIgnoreCase(outputString)){
			System.out.println("Input and Output Strings are Same :- It's Palindrome ---" + inputString );
		}
		else{
			System.out.println("Input and Output Strings are NOT Same :- It's NOT Palindrome ---" + inputString );
		}
	}
	

}
