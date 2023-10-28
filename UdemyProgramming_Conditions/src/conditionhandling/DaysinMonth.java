package conditionhandling;

public class DaysinMonth {
	
	public void checkDaysInMonth(int monthNumber){
		if(monthNumber > 12 || monthNumber <1 ){
			System.out.println("Invalid Month...");
		}
		else if(monthNumber ==1 || monthNumber ==3 || monthNumber ==5 || monthNumber ==7 || monthNumber ==8 || monthNumber ==10 || monthNumber ==12 ){
			System.out.println("Month has 31 days...");
		}
		else if(monthNumber ==4 || monthNumber ==6 || monthNumber ==9 || monthNumber ==11 ){
			System.out.println("Month has 30 days...");
		}
		else if(monthNumber ==2){
			System.out.println("Month has 28 or 29 days...");
		}
	}

}
