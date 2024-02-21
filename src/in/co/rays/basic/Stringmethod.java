package in.co.rays.basic;

public class Stringmethod {
	
	public static void main(String[] args) {
		String name="Riya Garhwal Abbu";
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		System.out.println(name.indexOf("r"));
		System.out.println(name.indexOf("Abbu"));
		System.out.println(name.lastIndexOf("u"));
		System.out.println(name.replace("R","A"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("Riya"));
		System.out.println(name.endsWith("Riya"));
		System.out.println(name.substring(10));
		
	}

}
