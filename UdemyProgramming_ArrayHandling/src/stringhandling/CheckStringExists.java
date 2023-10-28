package stringhandling;

public class CheckStringExists {
	
	public void checkStringExists(String originalString, String word){
		// Simple Check, SubString exists in a String
		if(originalString.contains(word)){
			System.out.println("Yes... Given Word exists in Statement");
		}
	}
	
	public void checkNumberofTimesStringExists(String originalString, String word){
		int count =0;
		
		// Running a loop for fetching 
		for(int i=0;i<=originalString.length()-word.length();i++){
		
			String subStr = originalString.substring(i, i+word.length());
			if(subStr.equals(word)){
				count = count + 1;
			}
		}
		System.out.println("Number of times given word found : "  + count);
	}
	
	public void wordCountSimpleApproach(String originalString, String word){
		int orginalStringLength = originalString.length();
		int finalLengthAfterRemove = originalString.replace(word, "").length();
		System.out.println("String Count Found : "+ (orginalStringLength-finalLengthAfterRemove)/word.length());		
				
	}

}
