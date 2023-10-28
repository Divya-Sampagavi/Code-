package looping;

public class PrimeNumber {

	public void checkPrimeNumber(int a){
		boolean value = false;
		for(int i=2;i<=a%2;i++){
			 if(a%2==0){
				 value = true;
				 break;
			 }
		}
		if(value == false){
			System.out.println();
			System.out.println("Its prime number : - " + a);
		}
	}
	
	
}
