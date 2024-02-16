package Checked;

public class TestLoginException {
	
	public static void main(String[] args) {
		
		String name="Admin";
		
		if(name.equals("Admin")) {
			
			System.out.println("user valid....");
		}else {
			try {
				throw new LoginException();
				
			}catch (LoginException e) {
				e.printStackTrace();
			}
		}
	}

}
