import java.util.*;

public class Hashing2 {

    public static void main(String[] args) {
        // Country(key) , population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        // search
        if (map.containsKey("Indonesia")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }

        // System.out.println(map.get("China")); // key exists
        // System.out.println(map.get("Indonesia")); // key doesn't exist

        // Iteration (1)
        // int arr[] = { 23, 4, 6 };
        // for (int i = 0; i < 3; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // // Iteration (2)
        // for (int val : arr) {
        // System.out.print(val + " ");
        // }
        // System.out.println();

        // Iteration (1)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Iteration (2)
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // Removing
        map.remove("China");
        System.out.println(map);

    }
}
