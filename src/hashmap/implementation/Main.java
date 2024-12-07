package hashmap.implementation;


public class Main {
    public static void main(String[] args) {
//    Map using Hash
        MapusingHash hash1 = new MapusingHash();
        hash1.put("Name", "Muhammad AbuBakar");
        System.out.println(hash1.get("Name"));
        hash1.remove("Name");

    }
}
