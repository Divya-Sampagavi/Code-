package stringhandling;

public class FindSpacesInString {

	public void findAndRemoveSpacesinString(String inputString){
		System.out.println("Inital String --> " + inputString);
		System.out.println("String after removing spaces --> " + inputString.replace(" ", "") );
		System.out.println("Number of Spaces in String " + (inputString.length() - inputString.replace(" ", "").length()));
	}
	
	
}
