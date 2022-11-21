package SS12_Collection_Framework.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpsonSorting {
    public static void main(String[] args) {
        List<Simpson> simpsons = new ArrayList<>();
        simpsons.add(new Simpson("Homer "));
        simpsons.add(new Simpson("Marge "));
        simpsons.add(new Simpson("Bart "));
        simpsons.add(new Simpson("Lisa "));

        System.out.println("sort ascending");
        Collections.sort(simpsons);
        simpsons.stream().map(s -> s.name).forEach(System.out::println);

        System.out.println("sort descending");
        Collections.reverse(simpsons);
        simpsons.stream().map(s -> s.name).forEach(System.out::println);
    }
}
