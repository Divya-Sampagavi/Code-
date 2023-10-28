package arrayTask;

public class SumArrayValues {
	
	public void sumValuesOfArray(){
		int [] arr = {34,65,2,456,67,54};
		int sum=0;
		for(int i=0 ;i < arr.length;i++){
			sum  = sum + arr[i];
		}
		System.out.println("Sum of All Values :  " + sum);
	}

}
