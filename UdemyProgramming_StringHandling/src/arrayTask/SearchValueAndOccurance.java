package arrayTask;

public class SearchValueAndOccurance {
	
	// Find value in Array and Its Occurance
	public void searchOccurance(int valueToSearch){
		int [] arr = {33,65,2,456,67,54,33,42,33,33};
		int count = 0;
		
		// Run a loop for each item in Array and Verify value exist of not, if yes then increase count
		for(int i=0 ;i <arr.length-1; i++){
			if(arr[i]==valueToSearch){
				count = count+1;
			}
		}
		
		if(count > 0){
			System.out.println("Value find in array successfully....");
			System.out.println("Value find -- "+ count + "-- Times");
		}
		else{
			System.out.println("Value Not found in Array");
		}
	}

}
