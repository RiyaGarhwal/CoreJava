package in.co.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMapCollection {
          public static void main(String[] args) {
			
        	
	        Map map=new HashMap();
	        
	        map.put(1, "Sanat");
	        
	        map.put(2, "riya");
	        
	        
	        map.put(3,"sameer");
	        System.out.println(map);
	        
	       map.replace(1, "prakhar");
	        
	        System.out.println(map);
             
	map.remove(3);
	
	System.out.println(map);
	
	map.replace(1, "sameer");
	
	
	System.out.println(map);
          }
}
