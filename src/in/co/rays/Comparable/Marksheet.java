package in.co.rays.Comparable;

public class Marksheet implements Comparable<Marksheet> {
	private int id;
	private String name;
	private int marks;
	
	public Marksheet(int id,String name,int marks) {
		
		this.id=id;
		this.name=name;
		this.marks=marks;
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public int getMarks() {
		return marks;
		
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public String toString() {
		return id+" "+name+" "+marks;
	}
	@Override
	public int compareTo(Marksheet m1) {
		// TODO Auto-generated method stub
		//return this.id-m1.id;
		//return this.marks-m1.marks;
		return this.name.compareTo(m1.name);
		
	}
	

	}
	
	


