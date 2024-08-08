public class FindUnique {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 4, 3,5};
        System.out.println(Unique(a));
    }

    private static int Unique(int[] a) {
        int unique = 0;
        for (int n : a) {
            unique ^= n;
        }
        return unique;
    }
}
