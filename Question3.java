import org.apache.commons.codec.digest.DigestUtils;

public class Question3 {

	public static void main(String[] args) {
		  String text = "HelloAIT";
	      String digest = DigestUtils.sha256Hex(text);
	   
	      System.out.println("Message = " + text);
	      System.out.println("Length = " + digest.length());
	      System.out.println("Message Digest = " + digest);
	}
	
	
}
