public class Primitives {
    public static void main(String[] args) {
        int id = 99;
        long largeInteger = 2243232323232300L; // bydefault int type

        char letter = 'a';

        float marks = 999.09f; // need to add 'f' bcz byDefault they are double type
        double largeDecimalNumber = 999999.232323;

        boolean check = false;

        // String is not a primitive (bcz it can be broken further)
        String name = "Abu Bakar";

        int a = 234_000_000;
        System.out.println(a);
    }
}
