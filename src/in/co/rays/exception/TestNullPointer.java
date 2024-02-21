package in.co.rays.exception;

public class TestNullPointer {
	public static void main(String[] args) {
		
		try {
			
			String name=null;
			
			System.out.println(name.length());
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("hello Riya");
	}
		
	}


