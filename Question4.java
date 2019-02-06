import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.digest.DigestUtils;

public class Question4 {

	public static void main(String[] args) {
		 
		String data = "D:\\Semester - 2\\Security\\test.txt";
	    File file = new File(data);
	     
	    try {
	         InputStream is = new FileInputStream(file);
	         String digest = DigestUtils.sha256Hex(is);
	         System.out.println("Digest = " + digest);
	         System.out.println("Digest Length = " + digest.length());
	     } 
	    catch (IOException e) {
	         e.printStackTrace();
	     }
	}
	
}
