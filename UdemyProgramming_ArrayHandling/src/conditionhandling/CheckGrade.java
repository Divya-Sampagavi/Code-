package conditionhandling;

public class CheckGrade {

	public void checkGrade(int mat, int phy, int che, int com , int bio){

		int calPercentage = ((mat+phy+che+com+bio)/5);

		if(calPercentage >= 90 &&  calPercentage <=100){
			System.out.println("Grade A");
		}
		else if(calPercentage >= 80){
			System.out.println("Grade B");
		}

		else if(calPercentage >= 70){
			System.out.println("Grade C");
		}

		else if(calPercentage >= 60){
			System.out.println("Grade D");
		}

		else if(calPercentage >= 40){
			System.out.println("Grade E");
		}

		else if(calPercentage >= 0){
			System.out.println("Grade F");
		}
		else
		{
			System.out.println("Invalid Marks");
		}

	}


	
}
