package in.co.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteByFile {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter file=new FileWriter("C:\\Users\\shrey\\OneDrive\\Desktop\\io\\cd.txt");
		
		file.write("hello");
		
		file.write(" I");

		file.write(" am");
		file.write(" a");
		file.write(" java");
		file.write(" devlepor");
		file.close();
		
		
		
		System.out.println("check");
		
	}
	
	
	

}
