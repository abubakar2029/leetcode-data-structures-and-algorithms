import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print("Enter iteration number: ");
        Scanner input = new Scanner(System.in);
        int i = 0;
        int iteration = input.nextInt();
        while (i < iteration) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
        }
    }
}
