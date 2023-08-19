import java.util.HashSet;
import java.util.Iterator;

public class Hashing {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // size
        System.out.println("size of set is :" + set.size());

        // search
        if (set.contains(1)) {
            System.out.println("present");
        }

        if (!set.contains(6)) {
            System.out.println("absent");

        }

        // Delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("absent");
        }

        // print all element
        System.out.println(set);

        // Iterator - Hashset does not have an order
        set.add(0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // isEmpty
        if (!set.isEmpty()) {
            System.out.println("set is not empty");
        }

    }
}
