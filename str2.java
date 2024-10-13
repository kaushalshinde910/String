package String;

public class str2 {

	public static void main(String[] args) {
		
		        String s1 = "hefshine";
		        String s2 = "hef";

		        // Using the contains() method
		        boolean startWith = s1.contains(s2);
		        System.out.println(startWith);

		        // Using custom mystartwith() method
		        boolean myStartWith = mystartwith(s1, s2);
		        System.out.println(myStartWith);
		    }

		    private static boolean mystartwith(String s1, String s2) {
		        if (s2.length() > s1.length()) {
		            return false;
		        }

		        for (int i = 0; i < s2.length(); i++) {
		            if (s2.charAt(i) != s1.charAt(i)) {
		                return false;
		            }
		        }

		        return true;
		    }
		}


