package conditionHandling;


public class InterChangeValues {
	
	public void swapUsingThirdVariable(int a, int b) {
		int k = a;
			a = b;
			b = k;
		System.out.println("Value of a is :" + a);
		System.out.println("Value of B is :" + b);
		
	}
	
	public void swapWithoutUsingThirdValriable(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a is :" + a);
		System.out.println("Value of B is :" + b);
	}
}
