package calling;

import conditionhandling.CheckDivisibleNumber;
import conditionhandling.CheckGrade;
import conditionhandling.DaysinMonth;
import conditionhandling.Largest_Lowest_Number;
import conditionhandling.TriangleType;

public class CallMethods {

	public static void main(String[] args) {
	
		CheckDivisibleNumber num = new CheckDivisibleNumber();
		num.checkDivisible(15);
		num.checkDivisible(22);
		num.checkDivisible(55);
		num.checkDivisible(57);
		
		CheckGrade grade = new CheckGrade();
		grade.checkGrade(10, 40, 60, 80, 90);
		grade.checkGrade(100, 40, 60, 80, 90);
		
		DaysinMonth days = new DaysinMonth();
		days.checkDaysInMonth(5);
		days.checkDaysInMonth(2);
		days.checkDaysInMonth(6);
		
		Largest_Lowest_Number number = new Largest_Lowest_Number();
		number.findLargestNumber(10, 40, 30);
		number.findLowestNumber(29, 66, 77);
		
		TriangleType type = new TriangleType();
		type.checkTriangle(10, 10, 10);
		type.checkTriangle(10, 10, 30);
		type.checkTriangle(10, 20, 30);
	}
	
}
