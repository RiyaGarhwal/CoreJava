package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(new Marksheet("Riya",06,100));
		list.add(new Marksheet("Jiya",07,95));
		list.add(new Marksheet("Siya",22,50));
		list.add(new Marksheet("Niya",12,75));
		
		System.out.println(list);
		
		Collections.sort(list,new OrderByNameAsc());
		System.out.println(list);
		
		List list1=new ArrayList();
		Collections.sort(list,new OrderbyMarks());
		System.out.println(list1);
		
		for (Object object : list1) {
			System.out.println(object);
		}
		
		
	}

}
