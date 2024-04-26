import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 1, 2, 3, 9);
    }

    // if you don't know the length of arguments, it will take variable length
    // arguments and give you an array
    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
