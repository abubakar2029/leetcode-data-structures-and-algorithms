
public class Shadowing {
    static int x = 90; // this will be shadowed at line 8

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x); // lower level will shadow higher level
        x++;
        System.out.println("After increment" + x); // lower level will shadow higher level
    }
}
