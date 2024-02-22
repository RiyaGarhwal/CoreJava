package in.co.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadByKeyBoard {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader inreader=new InputStreamReader(System.in);
		
		BufferedReader bw=new BufferedReader(inreader);
		
				PrintWriter pw=new PrintWriter("C:\\Users\\shrey\\OneDrive\\Desktop\\pic2\\shu.txt");
				
				String line=bw.readLine();
				
				while(!line.contentEquals("Riya")) {
					
					pw.println(line);
					
					line=bw.readLine();
				}
				pw.close();
				bw.close();
				
		
		
	}

}
