public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1; // Start from the second element
        int count = 1; // Track the count of occurrences

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1; // Reset count for a new element
            }

            if (count <= 2) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        // Fill the rest of the array with placeholder values, e.g., Integer.MAX_VALUE
        for (int i = uniqueIndex; i < nums.length; i++) {
            nums[i] = Integer.MAX_VALUE; // Placeholder value
        }

        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int length = removeDuplicates(nums);
        System.out.println("Number of elements after modification: " + length);
        System.out.print("Modified array: [");
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(nums[i]);
        }
        System.out.println("]");
    }
}
