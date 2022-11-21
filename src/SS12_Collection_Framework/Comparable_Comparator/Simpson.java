package SS12_Collection_Framework.Comparable_Comparator;

public class Simpson implements Comparable<Simpson>{
    String name;

    public Simpson(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Simpson o) {
        return this.name.compareTo(o.name);
    }
}
