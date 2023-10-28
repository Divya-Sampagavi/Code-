package interviewquestions;

public class SingletonClass {

	// Make a private Constructor
	
	public static SingletonClass obj = null;
	
	private SingletonClass(){
		
	}
	
	public static SingletonClass getInstance(){
		
		if(obj == null){
			obj  = new SingletonClass();
		}
		
		return obj;
		
	}
	
	
	
}
