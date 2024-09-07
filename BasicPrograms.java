class HelloWorld {
    public static void main(String[] args) {
        String str = "Hello Wolrd";
        String rev = "";
        
        
        for(int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        
        System.out.println(str.equals(rev));
    }
}
