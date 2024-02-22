package in.co.rays.thread;

public class TestWithOutThread {
	public static void main(String[] args) {
		WithOutThread t1=new WithOutThread("riya");
		WithOutThread t2=new WithOutThread("Garhwal");
		
		t1.run();
		t2.run();
	}

}
