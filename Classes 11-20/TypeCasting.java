public class TypeCasting {

    public static void main(String[] args) {

        // explicitly converting type
        int num = (int) (67.32);
        System.out.println(num);

        // automatic type promotion in expression
        int a = 259;
        byte b = (byte) (a); // 259 % 257
        System.out.println(b);
    }
}
