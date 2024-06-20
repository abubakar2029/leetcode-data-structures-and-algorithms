public class IsOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(67));
    }

    private static boolean isOdd(int i) {
//        67 into bitwise and last digit will be compared to 1
        return (i & 1) == 1;
    }
}
