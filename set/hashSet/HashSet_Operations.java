package set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Operations {
public static void main(String[] args) {
    Set<Integer> list=new HashSet<Integer>();

//    Add an item
    list.add(1);
    list.add(2);
    list.add(3);

    System.out.println(list);

//    Check an item contains
    System.out.println(list.contains(4)); // false
    System.out.println(list.contains(2)); // true

//    Remove
    System.out.println(list.remove(4)); // false
    System.out.println(list.remove(3)); // true

//    HashSet Size
    System.out.println(list.size());

}
}
