package String;

public class str3 {

    public static void main(String[] args) {
        String s1 = "hefshine";
        String s2 = "shine";

        // Using the endsWith() method
        boolean endWith = s1.endsWith(s2);
        System.out.println(endWith);

        // Using custom myEndWith() method
        boolean myEndWith = myEndWith(s1, s2);
        System.out.println(myEndWith);
    }

    private static boolean myEndWith(String s1, String s2) {
        if (s2.length() > s1.length()) {
            return false;
        }

        int startIndex = s1.length() - s2.length();
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != s1.charAt(startIndex + i)) {
                return false;
            }
        }

        return true;
    }
}
