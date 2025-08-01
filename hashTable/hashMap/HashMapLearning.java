package hashTable.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {
    public static void main(String[] args) {

        Map<Character, Integer> list = new HashMap<>();

//        Add items
        list.put('A', 65);
        list.put('B', 66);
        list.put('C', 66);

        System.out.println(list);
//        {A=65, B=66, C=66}

//        Get value of an item
        System.out.println(list.get('A'));

//        Remove an Item
        list.put('F', 33);
        list.remove('F');

//        HashMap Size
        System.out.println(list.size());

//        Loop Through a HashMap
        // Print keys
        System.out.println("\nKeys in list");
        for (Character i : list.keySet()) {
            System.out.print(i+" ");
        }
        // Print values
        System.out.println("\nPrint values in list");
        for (Integer i : list.values()) {
            System.out.print(i+" ");
        }

//        Edit a value
        list.put('A', list.getOrDefault('A',99)+1);
        list.put('D', list.getOrDefault('D',99)+1);
        System.out.println("\n"+list);
    }
}
