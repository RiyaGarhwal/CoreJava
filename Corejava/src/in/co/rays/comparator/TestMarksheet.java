package in.co.rays.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		
		List list=new ArrayList();
		
		list.add(new Marksheet("prakhar", 1, 45));
		list.add(new Marksheet("sanat", 2, 46));
		
		list.add(new Marksheet("abhishek", 3, 47));
		list.add(new Marksheet("riya", 4, 48));
		
		//System.out.println(list);
		
		Collections.sort(list,new OrderByNameAsc());
		
		System.out.println(list);
		
		
		
		
		  List list1=new ArrayList(list);
		  
		  
		  Collections.sort(list1,new OrderByMarks());
		  
		 // System.out.println(list1);
		  
		  for (Object object : list1) {
		  
		  System.out.println(object);
		  
		  }
		 
			
		}
		
		
		
	}


