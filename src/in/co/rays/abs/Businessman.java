package in.co.rays.abs;

public class Businessman implements Richman,SocialWorker{

	@Override
	public void helpToOther() {
		System.out.println("helping");
		
	}

	@Override
	public void earn() {
		System.out.println("earn money");
		
	}

	@Override
	public void donation() {
		System.out.println("donation");
		
	}

	@Override
	public void party() {
		System.out.println("party");
		
	}
	
    
}
