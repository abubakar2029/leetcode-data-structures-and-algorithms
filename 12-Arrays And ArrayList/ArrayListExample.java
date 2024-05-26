import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// when array size is undefined 
// you can add as many items here size does not matter
public class ArrayListExample {
    public static void main(String[] args) {

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(10);
        list.add(12);
        list.add(33);
        list.add(3323);
        list.add(33231);
        list.add(332);
        list.add(3);
        list.add(11);
        list.add(11121);
        list.add(11121);
        list.add(10);
        list.add(12);
        list.add(33);
        list.add(3323);
        list.add(33231);
        list.add(332);
        list.add(3);
        list.add(11);
        list.add(11121);

        System.out.println("Before : " + list);
        methods(list);
    }

    public static void methods(ArrayList<Integer> list) {
        Scanner in = new Scanner(System.in);

        list.set(0, 99);

        list.clear();
        System.out.println("After : " + list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }
}
