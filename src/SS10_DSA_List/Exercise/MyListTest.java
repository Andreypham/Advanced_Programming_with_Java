package SS10_DSA_List.Exercise;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        int len = myList.size();
        for (int i = 0; i < len; i++) {
            System.out.format("%4d", myList.get(i));
        }
        System.out.println();
        myList.add(3, 10);

        for (int i = 0; i < len; i++) {
            System.out.format("%4d", myList.get(i));
        }
        myList.remove(3);
        System.out.println();

        for (int i = 0; i < len; i++) {
            System.out.format("%4d", myList.get(i));
        }
        System.out.println();
        System.out.println("index element 4: " + myList.indexOf(2));
        System.out.println("exist element 2? " + myList.contains(2));
    }
}
