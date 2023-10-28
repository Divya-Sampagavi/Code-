package calling;

import arrayTask.AscendingDecendingOrder;
import arrayTask.LargestSmallestValues;
import arrayTask.SearchValueAndOccurance;
import arrayTask.SecondLargestSmallestValue;
import arrayTask.SumArrayValues;


public class CallMethods {

	public static void main(String[] args) {
	
		// Sum of All Values
		SumArrayValues sum = new SumArrayValues();
		sum.sumValuesOfArray();
		
		System.out.println("****************************************");
		
		AscendingDecendingOrder order = new AscendingDecendingOrder();
		order.orderValues();
		
		System.out.println("****************************************");
		
		LargestSmallestValues value = new LargestSmallestValues();
		value.findLargestSmallestValue();
		
		System.out.println("****************************************");
		SecondLargestSmallestValue sec = new SecondLargestSmallestValue();
		sec.findLargestSmallestValue();
		
		System.out.println("****************************************");
		SearchValueAndOccurance val = new SearchValueAndOccurance();
		val.searchOccurance(33);
		
	}
	
}
