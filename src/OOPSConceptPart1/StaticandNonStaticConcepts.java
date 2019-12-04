package OOPSConceptPart1;

public class StaticandNonStaticConcepts {

	String name="Tom"; //non static global variable
	static int age=25; //static global variable

	
	public static void main(String[] args) {
		
		//How to call Static methods and Variables
		//1. Direct calling...
		sum();
		//2.calling by class name....
		StaticandNonStaticConcepts.sum();
		
		//how to call static variables 
		//1.Direct calling...
		System.out.println(age);
		//2.calling by class name....
		System.out.println(StaticandNonStaticConcepts.age);
		
		
		
		// Non static methods/variables calling,,,,
		
		StaticandNonStaticConcepts obj=new StaticandNonStaticConcepts();
		obj.sendmail();
		System.out.println(obj.name);
		
		
	}

	public void sendmail() { //non static method
		System.out.println("Send Mail Method");
	}
	
	public static void sum() { //static method
		System.out.println("Sum Method");
		
	}
	
}
