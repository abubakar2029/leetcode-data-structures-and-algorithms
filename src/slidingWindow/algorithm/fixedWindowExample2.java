package slidingWindow.algorithm;

import java.util.ArrayList;

public class fixedWindowExample2 {
    private ArrayList<Character> list = new ArrayList<>();
    private int k = 3; //defining fixed window sized here

    public fixedWindowExample2(char[] arr) {
//        initializing first window
        for (int i = 0; i < k; i++) {
            list.add(arr[i]);
        }
        System.out.println(list.toString());

        // iterating over the array from k to n
        for (int i = k; i < arr.length; i++) {
            list.add(arr[i]);
//            an error was occurring here -  remove method was taking it as an index
            list.remove((Character) arr[i - k]);
            System.out.println(list.toString());
        }
    }


}
