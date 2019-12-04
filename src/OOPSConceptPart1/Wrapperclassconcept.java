package OOPSConceptPart1;

public class Wrapperclassconcept {

	public static void main(String[] args) {

		String x="100";
		System.out.println(x+20);
		
		System.out.println("@@@@@@@@@@@@@@@  Strring to Integer   @@@@@@@@@@@@@@@@@@@@@@@@@@@");
		//data conversion:Strring to Integer
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		String vs="200";
		System.out.println("Value of VS is :  "+ vs);
	

		int m=Integer.parseInt(vs);
		System.out.println(m+25);
	
		//String to double
		
		System.out.println("@@@@@@@@@@@@@@@  String to double   @@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		String y="12.33";
		double d=Double.parseDouble(y);
		System.out.println(10+d);
		
		String k1="12.44";
		double d1=Double.parseDouble(k1);
		System.out.println(d1);
		
		
		System.out.println("@@@@@@@@@@@@@@@  String to boolean   @@@@@@@@@@@@@@@@@@@@@@@@@@@");	
		
		//String to boolean
		
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		String v2="false";
		boolean b1= Boolean.parseBoolean(v2);
		System.out.println(b1);
		
		System.out.println("@@@@@@@@@@@@@@@  Integer to string conversion   @@@@@@@@@@@@@@@@@@@@@@@@@@@");	
		//Integer to string conversion
		
		int j=200;
		System.out.println(j+20);
		
		String s=String.valueOf(j);
		System.out.println(s+20);
		
		int j2=500;
		String s2=String.valueOf(j2);
		System.out.println(s2);
		System.out.println(s2+500);
		
		//String u="100A";
		//Integer.parseInt(u); //Number format exception -- for input string :"100A"
		
				
	}

}
