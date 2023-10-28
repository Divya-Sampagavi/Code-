package looping;

public class InterChangeValues {

	
	public void valueChangeThirdVariable(int a, int b){
		int c = a; 
		a  =  b;
		b  =  c;
		System.out.println("New Value of A:- "+ a);
		System.out.println("New Value of B:- "+ b);
		
	}
	
	public void valueChangeWithoutThirdVariable(int a, int b){ // a =8  b 5
		a  =  a+b;    // a=13
		b  =  a-b;    // b = 8
		a  =  a-b;    // a = 5 
		System.out.println("New Value of A:- "+ a);
		System.out.println("New Value of B:- "+ b);
		
	}
	
}
