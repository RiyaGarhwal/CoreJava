package in.co.rays.thread;

public class Account {

	private int balance;
	
	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance=balance;
		
	}
	public int getBalance() {
		
		try {
			Thread.sleep(200);
	}catch (InterruptedException e) {
		e.printStackTrace();
		
	}
		return balance;
	}
	
	
	public synchronized void deposit(String name,int amount) {
		
		int total=getBalance()+amount;
		
		setBalance(total);
		System.out.println(name+"balance ="+getBalance());
		
	}
	}