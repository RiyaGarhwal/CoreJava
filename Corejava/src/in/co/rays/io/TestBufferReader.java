package in.co.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferReader {
	
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("C:\\Users\\shrey\\OneDrive\\Desktop\\io\\xyz.txt");
		
		BufferedReader out = new BufferedReader(file);
		
		String line = out.readLine();

		while (line != null) {
			
			System.out.println(line);
			
		line = out.readLine();
		}
	}

}
