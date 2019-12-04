package OOPSConceptPart2;

public class BMW extends Car{

	//When same method is present both in Parent and Child with same name and same number of arguments, 
	//it is called Method Overriding
	
	public void start() {
		System.out.println("BMW.........start!!!.");
	}
	
	public void theftSafety() {
		System.out.println("BMW ....... TheftSafety!!!.");
	}
}
