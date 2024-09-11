import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String str = "programming";
        
        // Convert the string to a character array
        Character[] charArray = new Character[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        
        // Sort the character array in descending order
        Arrays.sort(charArray, Collections.reverseOrder());
        
        // Convert the sorted char array back to string
        StringBuilder sortedString = new StringBuilder(charArray.length);
        for (char c : charArray) {
            sortedString.append(c);
        }
        
        System.out.println("Sorted string in descending order: " + sortedString.toString());
    }
}
