package in.co.rays.oop;

public class Account {
	private int id;
	private String firstname;
	private String lastname;
	private String Address;
	
	public void setId(int id) {
		this.id = id;
		}
	public int getId() {
		return id;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getfirstname() {
		return firstname;
		
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
    public String getlastname() {
    	return lastname;
    }
    public void setAddress(String Address) {
    	this.Address = Address;
    }
    public String getAddress() {
    	return Address;
    }
    
}
