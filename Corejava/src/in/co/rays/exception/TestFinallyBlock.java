package in.co.rays.exception;

public class TestFinallyBlock {
	
	public static void main(String[] args) {
		try {
			int a=100;
			int b=2;
			int c=a/b;
			System.out.println(c);
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("finally block");
		}
		System.out.println("after finally block");
	}

}
