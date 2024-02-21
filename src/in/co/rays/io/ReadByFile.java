package in.co.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadByFile {
	
	
	public static void main(String[] args) throws IOException {
		
		FileReader file=new FileReader("C:\\Users\\shrey\\OneDrive\\Desktop\\io\\abc.txt");
		
		Scanner sc=new Scanner(file);
		
		
		while(sc.hasNext()) {
			
			
			System.out.println(sc.nextLine());
			
		}
		
	}
	
	

}
