import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverseExample {
    public static void main(String[] args) {
        // Initialize a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the original LinkedList
        System.out.println("Original LinkedList: " + list);

        // Reverse the LinkedList
        Collections.reverse(list);

        // Print the reversed LinkedList
        System.out.println("Reversed LinkedList: " + list);
    }
}



import java.util.LinkedList;

public class LinkedListReverseManualExample {
    public static void main(String[] args) {
        // Initialize a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the original LinkedList
        System.out.println("Original LinkedList: " + list);

        // Reverse the LinkedList manually
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        // Print the reversed LinkedList
        System.out.println("Reversed LinkedList: " + reversedList);
    }
}
