package in.co.rays.polymorphism;

public class Shape {

	private int borderwidth;
	private String color;
	
	public void setBorderwidth(int borderwidth) {
		this.borderwidth=borderwidth;
	}
	
	public int getBorderwidth() {
		return borderwidth;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void run() {
		System.out.println(getBorderwidth());
		System.out.println(getColor());
	}
	
	}

