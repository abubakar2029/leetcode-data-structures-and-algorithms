public class FunctionOverloading {
    public static void main(String[] args) {

    }
    // two or more functions of same name can exist if the parameters are different

    static void fun(int n) {
        System.out.println(n);
    }

    static void fun(String n) {
        System.out.println(n);

    }
}
