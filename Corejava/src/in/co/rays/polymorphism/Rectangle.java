package in.co.rays.polymorphism;

public class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	public void setLength(int length) {
		this.length=length;
	}
		
		public int getLength() {
			return length;
		}
	public void setBreadth(int breadth) {
		this.breadth=breadth;
	}
		public int getBreadth() {
			return breadth;
		}
		public void area() {
			int rArea=getLength()*getBreadth();
			System.out.println(rArea);
		}
		
	}








