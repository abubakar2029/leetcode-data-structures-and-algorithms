// public class Recursion {

//     public static void main(String[] args) {
//         print1(1);
//     }

//     static void print1(int n) {
//         System.out.println(n);
//         print2(2);
//     }

//     static void print2(int n) {
//         System.out.println(n);
//         print3(3);
//     }

//     static void print3(int n) {
//         System.out.println(n);
//     }
// }

// Instead of that call function by itself

public class Recursion {

    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        System.out.println(n);
        // if (n > 5)
        // return;
        print(n + 1);
    }

}