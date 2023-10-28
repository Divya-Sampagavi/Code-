package testing;

import java.util.ArrayList;
import java.util.List;

public class airlinesArrayAndList {
 public static void main(String[] args) {
	 String [] airlineCodes = {"A001N" , "A002N", "A003N", "A004G", "A005K", "A008N" }; 
	 int count = 0;
	 List<String> airlines = new ArrayList<>();
	 
	 for(int i=0; i<airlineCodes.length; i++) {
		 if (airlineCodes[i].endsWith("N")) {
			 count++;
			 airlines.add(airlineCodes[i]);
		 }
	 }
	 
	 if(count >= 3) {
		 System.out.println("Airlines ending with N :");
		 for (int i=0; i<airlines.size();i++) {
			 System.out.println(airlines.get(i));
		 }
	 }
	 else {
		 System.out.println("Airlines with code N is not present");
	 }
   }
}
