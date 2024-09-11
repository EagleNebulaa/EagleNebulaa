public class CamelToSnake {
    public static String convertCamelToSnake(String str) {
        // Replace all uppercase letters with _ followed by the lowercase letter
        String result = str.replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();
        return result;
    }

    public static void main(String[] args) {
        String camelCaseStr = "thisIsCamelCaseString";
        String snakeCaseStr = convertCamelToSnake(camelCaseStr);
        System.out.println("Snake case: " + snakeCaseStr);
    }
}
