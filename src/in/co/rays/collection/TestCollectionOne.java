package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollectionOne {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		list.add(1);
		
		list.add("One");
		
		list.add(2.14);
		
		list.add(3);
		
		System.out.println(list);
		
		//for (int i = 0; i < list.size(); i++) {
			
		//	System.out.println(list.get(i));
          
		//for (Object object : list) {
			
			//System.out.println(object);
	
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
         System.out.println(it.next());			
			it.remove();
		}
		System.out.println(list);
		
		
		}
		
		}
	


