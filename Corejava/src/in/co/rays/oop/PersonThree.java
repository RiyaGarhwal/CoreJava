package in.co.rays.oop;

import java.util.Date;

public class PersonThree {
	private int id;
	private String name;
	private Date dob;
	
	
	
	public void setId(int id) {
		this.id=id;
	}
    public int getId() {
    	return id;
    }
    public void setname (String name) {
    	this.name=name;
    }
    public String getname() {
    	return name;
    }
    public void setdob(Date dob) {
       this.dob=dob;
    }
     public Date getdob() {
         return dob;
     }
}
