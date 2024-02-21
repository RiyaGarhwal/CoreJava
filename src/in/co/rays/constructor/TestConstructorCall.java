package in.co.rays.constructor;

public class TestConstructorCall {
	
	public static void main(String[] args) {
		
	ConstructorCall c=new ConstructorCall();
	ConstructorCall c1=new ConstructorCall("Riya","Garhwal");
	ConstructorCall c2=new ConstructorCall("Car","Cycle","Bike");
	ConstructorCall c3=new ConstructorCall("Indore","Pune","Bangalore",12);
	
	System.out.println(c2.Car+" "+c2.Cycle+" "+c2.Bike);
	System.out.println(c3.Indore+" "+c3.Pune+" "+c3.Bangalore);
	c3.displaydetails();
	
	

}
}