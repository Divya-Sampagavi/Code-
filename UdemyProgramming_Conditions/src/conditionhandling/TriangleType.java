package conditionhandling;

public class TriangleType {
	
	public void checkTriangle(int side1, int side2, int side3){

		if(side1==side2 &&  side1==side3){
			System.out.println("Equilateral Triangle....");
		}

		else if(side1!=side2 &&  side2!=side3 && side1!=side3){
			System.out.println("Scalene Triangle....");
		}

		else if(((side1==side2 &&  side1!=side3) || (side1==side3 &&  side1!=side2))
		    || ((side1==side2 &&  side2!=side3) || (side2==side3 &&  side1!=side2))
		    || ((side1==side3 &&  side2!=side3) || (side2==side3 &&  side1!=side3))
		){
			System.out.println("Isosceles Triangle....");
		}

	}

}
