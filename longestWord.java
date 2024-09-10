public class LongestEvenWordLength {

    public static void main(String[] args) {
        // Example input string
        String input = "This is an example string with multiple words";
        
        // Find and print the length of the longest word with even length
        int longestEvenLength = findLongestEvenWordLength(input);
        System.out.println("Length of the longest even-length word: " + longestEvenLength);
    }

    public static int findLongestEvenWordLength(String str) {
        // Split the input string into words
        String[] words = str.split("\\s+");
        
        int maxLength = 0;
        
        // Iterate through each word
        for (String word : words) {
            // Check if the length of the word is even
            if (word.length() % 2 == 0) {
                // Update maxLength if this word is longer than the current maxLength
                if (word.length() > maxLength) {
                    maxLength = word.length();
                }
            }
        }
        
        return maxLength;
    }
}
