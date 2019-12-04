package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		//Compile time/Static polymorphism
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
		
		//This is called Top Casting
		Car c1=new BMW();//Child class object can be referred by parent class reference variable --- 
		//Run time / Dynamic polymorphism
	   c1.start();
	   c1.stop();
	   c1.refuel();
	   
		//Down Casting -- possible?
		
		BMW  b1=(BMW) new Car();//ClassCastException:
		
		
	}

}
