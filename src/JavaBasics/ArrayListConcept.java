package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
    
		ArrayList ar= new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add("Tom");
		ar.add("Hello");
		ar.add(12.33);
		
		System.out.println(ar.size());
		
		
		//If you want only integers in Arraylist .....
		
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		ar1.add(500);
		ar1.add(600);
		ar1.add(400);
		
		//If you want only Strings in Arraylist .....
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("test");
		
		

	}

}
