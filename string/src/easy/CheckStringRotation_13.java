/**
 * 
 */
package easy;

/**
 * @author sanjit
 *
 */
public class CheckStringRotation_13 {

	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDAB";
        boolean isStringRotation = checkStringRotation(s1,s2);
        System.out.println(isStringRotation);
		
	}

	private static boolean checkStringRotation(String s1, String s2) {
		String s3= s1+s1;
		/*if (s3.contains(s2)) {
			return true;
		} else {
			return false;
		}*/
		return s3.contains(s2);
		
	}

}
