package looping;

public class InterChangeValues {

	
	public void valueChangeThirdVariable(int a, int b){
		int c = a; 
		a  =  b;
		b  =  c;
		System.out.println("New Value of A:- "+ a);
		System.out.println("New Value of B:- "+ b);
		
	}
	
	public void valueChangeWithoutThirdVariable(int a, int b){
		a  =  a+b;
		b  =  a-b;
		a  =  a-b;
		System.out.println("New Value of A:- "+ a);
		System.out.println("New Value of B:- "+ b);
		
	}
	
}
