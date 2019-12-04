package OOPSConceptPart1;

public class Car {
	
	//Class Variables
	
		int mod;
		int wheel;

	public static void main(String[] args) {
		
		//new Car(); - is object of class Car
		//"new" keyword is used to create a object
		//a,b,c -- Object are reference variables
		
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2014;
		b.wheel=4;
		
		c.mod=2013;
		c.wheel=4;
		
		System.out.println("Below are original references");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		
		System.out.println("After shifting the references");
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod);
		System.out.println(c.mod);
	}

}
