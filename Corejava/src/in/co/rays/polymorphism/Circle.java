package in.co.rays.polymorphism;

public class Circle extends Shape {
	private int radius;
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
    public int getRadius() {
    	return radius;
    }
    
    public void area() {
    	double tArea=3.14*getRadius()*getRadius();
    	System.out.println(tArea);
    }
}
