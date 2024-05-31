public class SearchInString {
    public static void main(String[] args) {
        String name="Abubakar";

        System.out.println("Char array : "+name.toCharArray());
        search(name, 'a');
    }

    static boolean search(String str, char target) {
        if (str.length() == 0)
            return false;

        // using for
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target)
                return true;
            }
            
            // using for-each
            for (char ch : str.toCharArray()) {
                if (ch==target)
                return true;
        }
        return false;
    }
}
