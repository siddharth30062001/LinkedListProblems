import java.util.Collections;
import java.util.LinkedList;

class MergeSortedLinkedList {

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(100);
        LinkedList l1=new LinkedList();
        l1.add(30);
        l1.add(42);
        l1.add(90);
        l1.add(603);
        l1.add(2000);

        l.addAll(l1);
        System.out.println("Before sorting");
        System.out.println(l);
        Collections.sort(l);
        System.out.println("after sorting");
        System.out.println(l);
    }
    
}