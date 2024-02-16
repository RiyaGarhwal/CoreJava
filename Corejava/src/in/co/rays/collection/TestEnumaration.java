package in.co.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumaration {
	
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(1);
		
		v.add(2);
		
		v.add(3);
		v.add(4);
		
		
		System.out.println(v);
		
	     Enumeration e=v.elements();
	     
	     v.add(6);
	     
	     while(e.hasMoreElements()) {
	    	 
	    	 System.out.println(e.nextElement());
	     }
	     
	     
		
		
		
		
	}
	
	

}
