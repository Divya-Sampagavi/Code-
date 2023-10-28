package stringhandling;

public class CompareStringSpaces {

	public void compareStringwithSpaces(String arg1, String arg2){
		if(arg1.trim().equalsIgnoreCase(arg2.trim())){
			System.out.println("Strings are Same");
		}
		else{
			System.out.println("Strigns are Not Same");
		}
	}
	
}
