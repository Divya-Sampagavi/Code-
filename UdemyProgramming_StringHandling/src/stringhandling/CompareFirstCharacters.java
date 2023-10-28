package stringhandling;

public class CompareFirstCharacters {
	
	public void compareFirst10Characters(String data1 , String data2){
		
		// fetch first 10 characters of first string
		String s1 = data1.substring(0, 10);
		String s2 = data2.substring(0, 10);
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("First 10 characters are same");
			System.out.println(s1);
			System.out.println(s2);
		}
		else{
			System.out.println("First 10 characters are NOT same");
			System.out.println(s1);
			System.out.println(s2);
		}
	}

    public void compareFirstNCharacters(String data1 , String data2, int number){
		
		// fetch last 10 characters of first string
		String s1 = data1.substring(0, number);
		String s2 = data2.substring(0, number);
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("Last " + number + " characters are same");
			System.out.println(s1);
			System.out.println(s2);
		}
		else{
			System.out.println("Last " + number + " characters are NOT same");
			System.out.println(s1);
			System.out.println(s2);
		}
	}
	
}
