package in.co.rays.abs;

public class TestShape {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.setLength(25);
		r.setWidth(20);
		
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		
		r.area();
		r.sum();
		
		//by using  reference variables
		Shape s=new Rectangle();
		
	//s.sum();
		Shape.sum();
	}

}
