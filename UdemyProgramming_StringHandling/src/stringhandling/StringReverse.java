package stringhandling;

public class StringReverse {
	
	public void reverseStringApproach1(String inputString){
		for(int i=inputString.length()-1;i>=0;i--){
			System.out.print(inputString.charAt(i));
		}
		System.out.println();
	}

	public void reverseStringApproach2(String inputString){
		String outputString = "";
		for(int i=inputString.length()-1;i>=0;i--){
			outputString = outputString+ inputString.charAt(i);
		}
		System.out.println(outputString);
	}
	
}
