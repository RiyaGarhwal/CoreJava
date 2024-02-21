package in.co.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDataLineByLine  {
	
	public static void main(String[] args) throws IOException {
		
 FileWriter file=new FileWriter("C:\\Users\\shrey\\OneDrive\\Desktop\\io\\xyz.txt");
	PrintWriter pw=new PrintWriter(file);
		
		for(int i=0; i<=5; i++) {
			pw.println("riya");
		}
		pw.close();
		file.close();
		System.out.println("execution complete");
		
	}

}
