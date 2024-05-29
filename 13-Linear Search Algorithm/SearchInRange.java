public class SearchInRange {
    public static void main(String[] args) {
        String name="Abubakar";

        System.out.println("Char array : "+name.toCharArray());
        search(1,4,name, 'a');
    }

    static boolean search(int start, int end, String str, char target) {
        if (str.length() == 0)
            return false;

        // using for
        for (int i = start; i < end; i++) {
            if (str.charAt(i) == target)
                return true;
        }

        return false;
    }
}
