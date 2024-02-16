package in.co.rays.exception;

public class TestException {
	public static void main(String[] args) {
		try {
			int a=25;
			int b=0;
			int c=a/b;
			
	}catch (Exception e) {
		
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
		
	System.out.println(0);

	}
}
