package Practice;

import java.io.FileWriter;
import java.io.IOException;

public class WriteByFile {
	public static void main(String[] args) throws IOException {
		FileWriter file=new FileWriter("C:\\Users\\shrey\\OneDrive\\Desktop\\io\\gg.txt");
		file.write("Hello");
		file.write("I");
		file.write("am");
		file.write("a");
		file.write("java");
		file.write("developer");
		file.close();
		
		
		System.out.println("check");
		
	}

}
