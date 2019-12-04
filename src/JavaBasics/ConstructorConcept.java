package JavaBasics;

public class ConstructorConcept {
	
	public ConstructorConcept(){
		System.out.println("Default constructor");
	}
	
	public ConstructorConcept(int i){
		System.out.println("One Parameter constructor");
		System.out.println("Value of i is "   +i);
	}
	
	public ConstructorConcept(int i, int j){
		System.out.println("Two parameter constructor");
		System.out.println("Value of i is "   +i);
		System.out.println("Value of j is "   +j);
	}
	

	
	
	public static void main(String[] args) {

		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept(10);
		ConstructorConcept obj2=new ConstructorConcept(20,30);
		
		
		
	}

}
