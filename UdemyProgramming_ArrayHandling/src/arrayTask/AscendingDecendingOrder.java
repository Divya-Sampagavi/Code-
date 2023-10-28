package arrayTask;

public class AscendingDecendingOrder {
	
	// Sort Array in Ascending / Descending order
	public void orderValues(){
		int [] arr = {34,65,2,456,67,54};
		int z;
		for(int i=0 ;i <arr.length-1; i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					z= arr[j];
					arr[j]=arr[i];
					arr[i]=z;
				}
			}
		}

		// Display Array in Ascending Order 
		System.out.println("Ascending Order --------------");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("*******************************");

		// Display Array in Descending Order 
		System.out.println("Descending Order --------------");
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
		System.out.println("*******************************");

	}

}
