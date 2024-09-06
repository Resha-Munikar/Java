package Lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Resha");
        name.add("Aakash");
        name.add("Nikita");
        name.add("Deepa");
        name.add("Prahina");
        System.out.println("Before sorting:");
        System.out.println(name);
        Collections.sort(name);
        System.out.println("After sorting:");
        System.out.println(name);
    }
}
