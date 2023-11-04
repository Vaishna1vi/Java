// Example of list and array list in collections 

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(6);
        l.add(2);
        l.add(8);
        l.add(9);
        System.out.println(l);
        // l.size();
        l.remove(3);
        System.out.println(l);
        System.out.println(l.get(3));

        System.out.println(l.size());
    }
}
