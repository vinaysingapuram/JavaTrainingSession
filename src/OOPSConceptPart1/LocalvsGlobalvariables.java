package OOPSConceptPart1;

public class LocalvsGlobalvariables {
	//global variables - class variables
	
	String name="Tom";
	int age=25;

	public static void main(String[] args) {
	 
		int i=10; //Local Variable
		System.out.println(i);
		
		LocalvsGlobalvariables obj=new LocalvsGlobalvariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}

	public void sum() {
		int i=15; //local variable for sum method
		int j=20;
		
	}
	
}
