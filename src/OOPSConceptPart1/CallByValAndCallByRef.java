package OOPSConceptPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;
	

	public static void main(String[] args) {
		 
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		
		int x=10;
		int y=20;
		
		int m=obj.testsum(x,y); //Call by value or pass by value
		System.out.println(m);
		
		obj.p=50;
		obj.q=60;
		System.out.println("Before Swap");
		System.out.println("p:"+obj.p);
		System.out.println("q:"+obj.q);
	obj.swap(obj);
	System.out.println("After Swap");
	System.out.println("p:"+obj.p);
	System.out.println("q:"+obj.q);
	}

	
	  public int testsum(int a,int b) {
		  a=30;
		  b=40;
		  int c=a+b;
		  return c;
	}

	  public void swap(CallByValAndCallByRef t) {
	
		  int temp;
		  temp=t.p;
		  t.p=t.q;
		  t.q=temp;
	
}
}
