package in.co.rays.unchecked;

public class TestLoginException {
	
	public static void main(String[] args) {
		
		String name="Admin";
		
		if (name.equals("Admi")) {
			
			System.out.println("user valid");
			
		}else {
			
			LoginException l=new LoginException();
			
			//System.out.println(l.getMessage());
			
			l.printStackTrace();
		}
	}

}
