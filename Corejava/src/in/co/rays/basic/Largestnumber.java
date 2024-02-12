package in.co.rays.basic;

public class Largestnumber {
	public static void main(String[] args) {
		int[] arr= {4,8,20,37,67,15,11};
		int a=0;
		
for (int i=0; i<arr.length; i++) {	
	if (a<arr[i]) {
		a=arr[i];
	}	
	}
	System.out.println(a);
}
	}


