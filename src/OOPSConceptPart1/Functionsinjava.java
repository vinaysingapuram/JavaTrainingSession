package OOPSConceptPart1;

public class Functionsinjava {

	public static void main(String[] args) {
	
		Functionsinjava obj=new Functionsinjava();
		//by above line, one object (Functions in java()) is created, obj is reference 
		//variable, referring to this object
		//after creating the object, a copy of all non static methods will be given to this object
		
		obj.test();
		int l=obj.pqr();
		System.out.println(l);
		String s1=obj.qa();
		System.out.println(s1);
		int d1=obj.division(6, 2);
		System.out.println(d1);
		
		
	}
	
	//non static methods
	//void -- does not return any value
	//return type of  test method is - void
	public void test() { //no input, no output
		
		System.out.println("Test Method");
	}
	//return type of pqr method is - int
	public int pqr(){//no input, some output
		System.out.println("pqr Method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}

	public String qa() {//no input, some output
		System.out.println("qa Method");
		String s="Selenium";
		return s;
	}
	//return type is: integer
	//Method name is : division
	//x,y are input parameters/arguments
	public int division(int x,int y) {
		System.out.println("Division Method");
		int d=x/y;
		return d;
		
	}
	
	
}
