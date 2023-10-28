package arrayTask;

public class LargestSmallestValues {
	
	// First Sort Array in assending order and fetch last value
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
		// Now fetch last value from Array
		System.out.println("Largest Value in Array is "+ arr[arr.length-1]);
		
		// Fetch first value of Array, would be smallest value
		System.out.println("Smallest Value in Array is "+ arr[0]);
	}

}
