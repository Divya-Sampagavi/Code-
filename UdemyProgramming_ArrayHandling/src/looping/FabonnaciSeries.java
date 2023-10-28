package looping;

public class FabonnaciSeries {
	
	public void generateFabonnicSeries(){
		
		int a=0;
		int b=1;
		System.out.print(a +" , "+b);
		// Generate fabonnaci series till 100
		while(a+b<100){
		    b = a + b;
		    a = b - a;
		    System.out.print(" , " + b);
		}
		
	}

}
