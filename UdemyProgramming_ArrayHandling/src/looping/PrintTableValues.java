package looping;

public class PrintTableValues {
	
	public void printTable(int input){
		for(int i=1;i<=10;i++){
			if((input*i) % 3!=0 && (input*i) % 5!=0 && (input*i) % 7!=0){
				System.out.println(input*i);
			}
		}
	}

}
