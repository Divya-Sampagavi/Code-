package looping;

public class FabonnaciSeries {
	
	
	// 0  1    1    2   a= 3     b=5....     8
	
	public void generateFabonnicSeries(){
		
		int a=0;
		int b=1;
		System.out.print(a +" , "+b);
		// Generate fabonnaci series till 100
		while(a+b<100){
		    b = a + b;  // b = 8 
		    a = b - a;  // 8 - 3 = 5
		    System.out.print(" , " + b);	
		    
		}
	}
}
