class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {2,6,4,1,8};
        int max = arr[0];
        
        for(int i = 0; i < arr.length-1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } 
        }
        System.out.println(max);
    }
}
