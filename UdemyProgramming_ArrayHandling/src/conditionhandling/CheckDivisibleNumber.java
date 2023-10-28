package conditionhandling;

public class CheckDivisibleNumber {
	
	public void checkDivisible(int inputNumber){
		if(inputNumber % 5 ==0 && inputNumber % 11==0){
			System.out.println("Number " + inputNumber+ "  is divisible by both 5 and 11");
		}
		else if(inputNumber % 5 ==0){
			System.out.println("Number " + inputNumber+ " is divisible by only 5");
		}
		else if(inputNumber % 11 ==0){
			System.out.println("Number " + inputNumber+ "  is divisible by only 11");
		}
		else {
			System.out.println("Number " + inputNumber+ "  is not divisible by 5 and 11");
		}
	}

}
