package OOPSConceptPart2;

public interface USBank { 

	int min_bal=100;
	
	public void credit();
	public void debit();
	public void transferMoney();
	
	//Only method declaration.
	//no method body, only prototype.
	//in interface we can declare variables, and Variables are by default static in nature.
	//Variable value will not be changed /Its final or constant in nature
	//no static methods in interface
	//no main method in interface
	//we cannot create object of the interface
	//interface is abstract in nature.
	
}
