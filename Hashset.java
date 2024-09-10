/* Find common characters between strings Code snippet - https://onlinegdb.com/2_k3E2v6H Ask the candidate to fork the above code The candidates response url must be added in the comments Example: string1 = "abc"; string2 = "dcb"; common characters = "bc"; */

import java.util.HashSet;

class HelloWorld {
    
    public static String commonChar(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        HashSet<Character> set = new HashSet<>();
        String rep = "";
        
        for (char c1 : arr1) {
            for (char c2 : arr2) {
                if (c1 == c2 && !set.contains(c1)) {
                    rep = rep + c1;
                    set.add(c1); // To avoid adding the same character multiple times
                }
            }
        }
        return rep;
    }

    public static void main(String[] args) {
        String str1 = "Heyitsme";
        String str2 = "Imtheproblem";
        
        String result = commonChar(str1, str2);
        System.out.println(result);
    }
}
