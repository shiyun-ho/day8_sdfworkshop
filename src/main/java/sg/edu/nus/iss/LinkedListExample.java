package sg.edu.nus.iss;

import java.util.LinkedList;

public class LinkedListExample {
    //array is fixed, list is dynamic
    //linked list is like A -> B -> C-> D

    public static void main(String[] args) {
       //illustrates what happens when we remove in between
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("F");
        ll.add("G"); 

        //prints linked list
        ll.forEach(itm -> System.out.println(itm));

        ll.remove("C");

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
    

}
