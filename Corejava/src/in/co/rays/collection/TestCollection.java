package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection a=new ArrayList();
		
		a.add(3.14);
		a.add("two");
		a.add("true");
		a.add(2);
		a.add("a");
		
		System.out.println(a);
		
		Collection a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		System.out.println(a1);
		
		a.addAll(a1);
		System.out.println(a);
		
		System.out.println(a.remove("two"));
		System.out.println(a);
		
		
	}

}
