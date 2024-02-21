package in.co.rays.Comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		list.add(new Marksheet(1,"prakhar",107));
		list.add(new Marksheet(4,"sanat",106));
		list.add(new Marksheet(6,"sameer",102));
		list.add(new Marksheet(3,"Aman",108));
		list.add(new Marksheet(2,"ram",104));
		
//		System.out.println(list);
		Collections.sort(list);
		
		for (Object object : list) {
		System.out.println(object);
		
		}
		
		
	}

}
