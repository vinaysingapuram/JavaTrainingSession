package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
 //Array - to store similar data type in an array variable
		
		//int Array
		//lowest bound or index =0
		//upper bound or index=n-1 (n is size of array)
		//1D- Array
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;		
		
	System.out.println(i[2]);		
	//	System.out.println(i[4]);	//ArrayIndexOutOfBoundsException
	System.out.println(i.length); // prints the size or length of the array
	
	//print all the values of the array , use for loop
	
	for(int j=0;j<i.length;j++) {
		System.out.println(i[j]);
	}
		
	
	//double array
	double d[]=new double[3];
			d[0]=12.33;
	        d[1]=13.44;
	        d[2]=45.55;
	
	        System.out.println(d[2]);	
		
	//character array
	        
	        char c[]=new char[3];
	        c[0]='a';
	        c[1]='2';
	        c[2]='$';
	    
	 // Boolean array
	        boolean b[]=new boolean[2];
	        b[0]=true;
	        b[1]=false;
	        
	 // String Array
	        
	        String s[]=new String[3];
	        s[0]="Test";
	        s[1]="for String";
	        s[2]="Array";
	        
	        System.out.println(s.length);
	        
	        //Object Array (it is an Class) --> it is Super Class in Java
	        Object ob[]=new Object[6];
	        ob[0]="Tom";
	        ob[1]=25;
	        ob[2]=12.33;
	        ob[3]="1/1/1990";
	        ob[4]='M';
	        ob[5]="London";
	        System.out.println(ob[5]);
	        System.out.println(ob.length);
	        
	        for(int x=0;x<ob.length;x++)
	        {
	        	System.out.println(ob[x]);
	        	
	        }
	        
	}

}
