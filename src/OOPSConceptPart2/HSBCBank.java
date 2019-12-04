package OOPSConceptPart2;

public class HSBCBank implements USBank,BrazilBank{ //Multiple Inheritance
	// is a relationship
	
	//If a class is implementing any Interface, it is mandatory to define/Override the methods of interface
	
	//Below 3 methods are overridden from USBank
	public void credit() {
		System.out.println("HSBC ....... credit");
	}


	public void debit() {
		System.out.println("HSBC ....... debit");
	}
	

	public void transferMoney() {
		System.out.println("HSBC ....... transferMoney");
	}
	
	//Below 2 methods are from HSBCBank
	
	public void educationLoan() {
		System.out.println("HSBC ....... education Loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC ....... carLoan");
	}
	
	//Implementing BrazilBank Method
	
	public void mutualfunds() {
		System.out.println("HSBC ....... mutualfunds");
	}
	
}
