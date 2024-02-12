package in.co.rays.basic;

public class Reversenumber {
	public static void main(String[] args) {
		int a=352718;
		int b=0;
		int c;
		
	while (a!=0) {
		c=a%10;
		b=b*10+c;
		a=a/10;	
	}
	System.out.println(b);
	}

}
