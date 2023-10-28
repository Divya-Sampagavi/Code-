package calling;

//************************* Code Information **********************************
//        Code Developer : Testing World - 91 - 8743 - 913 - 121
//        thetestingworld.com | testingworldnoida at gmail | 

import looping.FabonnaciSeries;
import looping.InterChangeValues;
import looping.PrimeNumber;
import looping.PrintStars;
import looping.PrintTableValues;


public class CallMethods {

	public static void main(String[] args) {
	
	
		
		InterChangeValues obj = new InterChangeValues();
		obj.valueChangeThirdVariable(100, 200);
		obj.valueChangeWithoutThirdVariable(100, 200);
		
		FabonnaciSeries obj1 = new FabonnaciSeries();
		obj1.generateFabonnicSeries(); 
		
		PrimeNumber obj2 = new PrimeNumber();
		obj2.checkPrimeNumber(25);
		
		PrintStars star = new PrintStars();
		star.printStars();
		star.printStarsSpacesBetween();
		
		PrintTableValues val = new PrintTableValues();
		val.printTable(2);
	}
	
}
