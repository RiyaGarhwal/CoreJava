package in.co.rays.inheritance11;

public class TestShape extends Shape {
	public static void main(String[] args) {
		TestShape test= new TestShape();
		test.setColor("Purple");
		test.setBorderwidth(10);
		
		//Shape s=new Shape();
		Circle c=new Circle();
		Triangle a=new Triangle();
		Rectangle r=new Rectangle();
		
//		s.setColor("Purple");
//		s.setBorderwidth(10);
		
		c.setRadius(5);
		
		a.setBase(4);
		a.setHeight(6);
		
		r.setLength(12);
		r.setBreadth(11);
		
		
		c.area(); 
		a.area();
		r.area();
		
		
		 
	}

}
