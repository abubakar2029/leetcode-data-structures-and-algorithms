import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        // String name = input.next(); // will take only first word
        System.out.println("input is : " + name);

        double marks = input.nextDouble();
        System.out.println("input is : " + marks);

    }
}
