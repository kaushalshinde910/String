package String;

public class sortstr {

    public static void main(String[] args) {
        String s1 = "43521";
        char[] ca = s1.toCharArray();

        for (int i = 0; i < ca.length; i++) {
            for (int j = i + 1; j < ca.length; j++) {
                if (ca[i] > ca[j]) {
                    char temp = ca[i];
                    ca[i] = ca[j];
                    ca[j] = temp;
                }
            }
        }

        String s2 = new String(ca);
        System.out.println(s2);
    }
}

