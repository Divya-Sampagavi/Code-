package arrayTask;

public class SecondLargestSmallestValue {
	
	// First Sort Array in assending order and fetch 2nd last value for largest and 2nd value from start for 2nd smallest
	public void findLargestSmallestValue(){
		int [] arr = {34,65,2,456,67,54};
		int z=0;
		
		// Sorting Array in Ascending order
		for(int i=0 ;i <arr.length-1; i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					z= arr[j];
					arr[j]=arr[i];
					arr[i]=z;
				}
			}
		}
		// Now fetch 2nd last value from Array
		System.out.println("2nd Largest Value in Array is "+ arr[arr.length-2]);
		
		// Fetch second value of Array, would be smallest value
		System.out.println("2nd Smallest Value in Array is "+ arr[1]);
	}

}
