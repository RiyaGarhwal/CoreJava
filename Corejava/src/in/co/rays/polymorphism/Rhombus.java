package in.co.rays.polymorphism;

public class Rhombus extends Shape {
	
	    private int d1;
	    private int d2;
	    
	    public void setD1(int d1) {
	    this.d1=d1;
	    }
	    public int getD1() {
	    	return d1;
	    	
	    }
	    public void setD2(int d2) {
	    	this.d2=d2;
	    }
	    	public int getD2() {
	    		return d2;
	    	}
	    
	     
	    public void area() {
	    	int mArea=getD1()*getD2()/2;
	    	System.out.println(mArea);
	    	
	    	
	    
	}


}
