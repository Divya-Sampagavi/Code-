package stringhandling;

public class CompareLastCharacters {
	
	public void compareLast10Characters(String data1 , String data2){
		

		String s1 = data1.substring(data1.length()-10, data1.length());
		String s2 = data2.substring(data2.length()-10, data2.length());
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("Last 10 characters are same");
			System.out.println(s1);
			System.out.println(s2);
		}
		else{
			System.out.println("Last 10 characters are NOT same");
			System.out.println(s1);
			System.out.println(s2);
		}
	}

    public void compareLastNCharacters(String data1 , String data2, int number){
		
		// fetch last 10 characters of first string
		String s1 = data1.substring(data1.length()-number, data1.length());
		String s2 = data2.substring(data2.length()-number, data2.length());
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
