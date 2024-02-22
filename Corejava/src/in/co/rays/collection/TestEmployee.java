package in.co.rays.collection;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e=new Employee(1, "sameer", 1000);
		Employee e1=new Employee(1, "sameer", 1000);
		
		System.out.println(e);
		
		System.out.println(e1);
		
		System.out.println(e1.hashCode());
		
		System.out.println(e.hashCode());
		
		System.out.println(e.equals(e1));
		
		
		
		
	}

}
