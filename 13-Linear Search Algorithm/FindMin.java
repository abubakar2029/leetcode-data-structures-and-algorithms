public class FindMin {
    public static void main(String[] args) {
        String name = "Abubakar";

        System.out.println("Char array : " + name.toCharArray());
        System.out.println("Char array String.valueOF: " + String.valueOf(name.toCharArray()));
        System.out.println("Char array Arrays.toString: " + java.util.Arrays.toString(name.toCharArray()));

        min(name);
    }

    static boolean min(String str) {
        if (str.length() == 0)
            return false;

        char min = str.charAt(5);
        for (char ch : str.toCharArray()) {
            if (ch < min) {
                min = ch;
            }
        }
        System.out.println(min);

        return false;
    }
}
