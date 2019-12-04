package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		//+ -> is a concatenation operator
		int a=100;
		int b=200;
		
		String x="Hello";
		String y="Java";
		
		System.out.println(a+b);
		System.out.println("Addition of a and b is:" +(a+b));
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
	}

}
