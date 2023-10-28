package conditionhandling;

public class Largest_Lowest_Number {

	public void findLargestNumber(int a, int b, int c){
		
		if(a>=b && a >=c){
			System.out.println("Largest Number...." + a);
		}
		else if(b>=a && b >=c){
			System.out.println("Largest Number...." + b);
		}
		else if(c>=a && c >=b){
			System.out.println("Largest Number...." + c);
		}
		
	}
	
     public void findLowestNumber(int a, int b, int c){
		
		if(a<=b && a <=c){
			System.out.println("Lowest Number...." + a);
		}
		else if(b>=a && b >=c){
			System.out.println("Lowest Number...." + b);
		}
		else if(c>=a && c >=b){
			System.out.println("Lowest Number...." + c);
		}
		
	}
	
}
