package conditionHandling;

public class FibonacciSeries {

	public void getData (int n) {
		int a = 0, b = 1;
		System.out.println(a + " " + "," + b + " "+ ",");
		while (a+b<=n) {
			b = a + b;
			a = b - a;
			
		}
		
	}
}
