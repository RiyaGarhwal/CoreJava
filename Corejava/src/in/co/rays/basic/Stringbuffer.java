package in.co.rays.basic;

public class Stringbuffer {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Vijay");
		sb.append("Dinanath Chouhanhh");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(5));
		System.out.println(sb.indexOf("Dinanath"));
		System.out.println(sb.replace(0,5,"jay"));
	}

}
