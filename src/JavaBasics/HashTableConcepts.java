package JavaBasics;

import java.util.Hashtable;

public class HashTableConcepts {

	public static void main(String[] args) {
	
	Hashtable h=new Hashtable();
	
	h.put("A", "Test");
	h.put("BB", "Hello");
	h.put("C", "World");
	
	System.out.println(h.size());
	
	h.put(1, 100);
	h.put(2, 200);
	
	System.out.println(h.size());
	
	System.out.println(h.get("A"));
	System.out.println(h.get(1));
	System.out.println(h.get("C"));
	
	h.put(3, "Vinay");
	
	Hashtable<Integer, Integer> h1=new Hashtable<Integer, Integer>();
	h1.put(4, 400);
	
	Hashtable<Integer, String> h2=new Hashtable<Integer, String>();
	h2.put(5, "Kumar");
	
	System.out.println(h2.size());
	}

}
