package in.co.rays.oop;

import java.util.Date;

public class TesPersonThree {
	public static void main(String[] args) {
		
		PersonThree t=new PersonThree();
		
		t.setId(12);
		t.setname("Riya");
		t.setdob(new Date());
		
		
		System.out.println(t.getId());
		System.out.println(t.getname());
		System.out.println(t.getdob());
	}
	
	

}
