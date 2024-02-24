package in.co.rays.thread;

public class Test implements Runnable{
	
	String name=null;
	
	public Test(String name) {
		this.name=name;
	}

	 
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<=5; i++) {
			System.out.println(i+" "+name);
		}
	}
}
