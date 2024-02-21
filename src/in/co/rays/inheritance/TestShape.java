package in.co.rays.inheritance;

public class TestShape extends Triangle {
	public static void main(String[] args) {
		TestShape t=new TestShape();
		t.setColor("Blue");
		t.setBorderwidth(25);
		
		System.out.println(t.getColor());
		System.out.println(t.getBorderwidth());
		
		t.setBase(3);
		t.setHeight(5);
		
		
	System.out.println(t.getBase());
	System.out.println(t.getHeight());
	
	     t.area();
		}
	
	

}
