package in.co.rays.exception;

public class IndexOutofBound {
	
	public static void main(String[] args) {
		
	try {
	String[] names= {"abc","san"};
	String name="xyz";
	
	System.out.println(names[0]);
	
	System.out.println(name.charAt(8));
	int a=100;
	int b=0;
	int c=a/b;
	
	System.out.println(c);
	}catch (IndexOutOfBoundsException e) {
		System.out.println(e);
	}
	catch(ArithmeticException e) {
		System.out.println("Exception="+e);
		
	}
	System.out.println("prakhar");
		
	
	
	
}
}