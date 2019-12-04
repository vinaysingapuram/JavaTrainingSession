package OOPSConceptPart1;

public class Methodoverloading {

	public static void main(String[] args) {

		
		//we can overload maim method also.But with different arguments or input parameters within the same class
	   //Method overloading can be of same name, same number of arguments but with different data types
		
		Methodoverloading obj=new Methodoverloading();
		obj.sum();		
		obj.sum(10);
		obj.sum(15,20);
	}

	
	//method overloading
	
	//we can overload .But with different arguments or input parameters within the same class
	//Method overloading can be of same name, same number of arguments but with different data types

	public void sum() {
		System.out.println("SUM method with zero input parameters");
	}
	
	public void sum(int i) {
		System.out.println("SUM method with one input parameters");
		System.out.println(i);
	}
	
	public void sum(int k,int l) {
		System.out.println("SUM method with two input parameters");
		System.out.println(k+l);
	}
	
}



