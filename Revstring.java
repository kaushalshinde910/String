package String;

public class Revstring {

    public static void main(String[] args) {
        // Original string
        String s1 = "students good very are all you ";
        // New string to store reversed words
        String newstr = "";
        // Split the original string into an array of words
        String rev[] = s1.split(" ");
        // Iterate through the array in reverse order
        for (int i = rev.length - 1; i >= 0; i--) {
            // Concatenate each word to the new string
            newstr = newstr + rev[i] + " ";
        }
        // Print the reversed string
        System.out.println(newstr);
    }
}
