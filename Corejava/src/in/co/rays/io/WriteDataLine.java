package in.co.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WriteDataLine {
	public static void main(String[] args) throws IOException {
		try {
			FileReader file = new FileReader("C:\\Users\\shrey\\OneDrive\\Desktop\\io\\xyz.txt");
			int ch = file.read();
			while (ch != -1) {
				System.out.print((char) ch);
				ch = file.read();
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);

		}
	}
}