package hashTable.hashMap;


public class Main {
    public static void main(String[] args) {
//    Map using Hash
        MapusingHash hash1 = new MapusingHash();
        hash1.put("Name", "Muhammad AbuBakar");
        System.out.println(hash1.get("Name"));
        hash1.remove("Name");

//        Map using Linked List
        HashmapImplementation<String, Integer> hash2 = new HashmapImplementation<>();
//        if generic Objects are not defined it can cause runtime errors
        hash2.put("AbuBakar", 10);
        hash2.put("Ahmed", 20);
        hash2.put("Ayan", 30);

        System.out.println(hash2.get("Ahmed"));
        System.out.println(hash2.isEmpty());
    }
}
