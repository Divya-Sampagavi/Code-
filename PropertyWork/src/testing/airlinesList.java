package testing;

import java.util.ArrayList;

public class airlinesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		ArrayList<String> airlines = new ArrayList<String>();
		airlines.add("A001N");
		airlines.add("A002N");
		airlines.add("A003N");
		airlines.add("A004M");
		airlines.add("A123N");
		airlines.add("A555MN");
		
		for (int i=0; i<airlines.size();i++) {
			String airlineNo = airlines.get(i);
			if (airlineNo.endsWith("N")) {
				count = count +1;
			}
		}
		if(count>=5) {
			
		}
		System.out.println("No. of airlines ending with N is :" + count);
		
		
		
	}

}
