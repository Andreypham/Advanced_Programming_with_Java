package SS10_DSA_List.Exercise;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.add(5, 4);
        myLinkedList.add(6, 8);
        myLinkedList.add(1, "Peter");
        myLinkedList.add(1, "Jane");
        myLinkedList.printList();
        System.out.println();

        myLinkedList.addFirst("begin");
        myLinkedList.addLast("end");
        myLinkedList.remove(1);
        myLinkedList.remove("Peter");
        myLinkedList.printList();
        System.out.println();

        System.out.println("Exist element Peter? " + myLinkedList.contains("Peter"));
        System.out.println("Exist element Mary? " + myLinkedList.contains("Mary"));
        System.out.println("index element 8: " + myLinkedList.indexOf(8));
        System.out.println("First element: " + myLinkedList.getFirst());
        System.out.println("Last element: " + myLinkedList.getLast());
        System.out.println("Size List: " + myLinkedList.size());
        System.out.println("Element in index: " + myLinkedList.get(2));

        myLinkedList.clear();
        System.out.println("Data after clear");
        myLinkedList.printList();
    }
}
