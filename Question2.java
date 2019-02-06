import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Question2 {

	public static void main(String args[]) throws Exception{
	
		   int count;
		   byte[] buffer= new byte[8192];
	  
	      MessageDigest digest = MessageDigest.getInstance("SHA-256");
	      
	      BufferedInputStream file = new BufferedInputStream(new FileInputStream("D:\\Semester - 2\\Security\\test.txt"));
	      while ((count = file.read(buffer)) > 0) {
	          digest.update(buffer, 0, count);
	      }
	      file.close();
	      
	      byte[] hash = digest.digest();

	      StringBuffer hexString = new StringBuffer();
	      
	      for (int i = 0;i<hash.length;i++) {
	         hexString.append(Integer.toHexString(0xFF & hash[i]));
	      }
	      System.out.println("Hex format : " + hexString.toString());
	
	}
	
}
