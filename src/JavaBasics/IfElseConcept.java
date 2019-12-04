package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		//comparision operators
		//< > 
		
		int c=50;
		int d=50;
		
		if(c==d){
			System.out.println("c and d are equal");
		}
		else
		{System.out.println("c and d are not equal");
		
		} 	
		
		//write a logic to find the higest number
		//nested if-else
		int e=10;
		int f=300;
		int g=30;
		if(e>f & e>g) {
			System.out.println("e is the greatest");
		}
		else if(f>g) {
				System.out.println("f is greatest");
			}
			else
			{System.out.println("g is greatest");}
		
	}

}
