package looping;

public class PrintStars {

	
	public void printStars(){
		for(int i=1;i<=6;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printStarsSpacesBetween(){
		System.out.println("---------------------------------------------------");
		for(int i=1;i<=6;i++){
			for(int j=1;j<=5;j++){
				if(j>1 && j <5 && i!=1 && i!=6){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
}
