import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Scanner;

public class Question1 {

	public static void main(String args[]) throws Exception{
	     
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter Message");
	      String message = sc.nextLine();
	     
	      MessageDigest digest = MessageDigest.getInstance("SHA-256");
	      byte[] hash = digest.digest(message.getBytes(StandardCharsets.UTF_8));

	      StringBuffer hexString = new StringBuffer();
	      
	      for (int i = 0;i<hash.length;i++) {
	         hexString.append(Integer.toHexString(0xFF & hash[i]));
	      }
	      System.out.println("Hex format : " + hexString.toString());     
	   }	
}
