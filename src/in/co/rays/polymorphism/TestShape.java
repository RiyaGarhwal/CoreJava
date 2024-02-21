package in.co.rays.polymorphism;

public class TestShape extends Shape {
	
	public static void main(String[] args) {
		
	
	Circle c=new Circle();
	Rectangle r=new Rectangle();
	Rhombus rh=new Rhombus();
//	Shape s=new Shape();
//	
	c.setColor("Blue");
	c.setBorderwidth(25);
	
	r.setLength(10);
	r.setBreadth(15);
	
	rh.setD1(4);
	rh.setD2(6);
	
	c.setRadius(8);
	
	c.area();
	r.area();
	rh.area();
	c.run();
	
	
	
	
	
	}
}
