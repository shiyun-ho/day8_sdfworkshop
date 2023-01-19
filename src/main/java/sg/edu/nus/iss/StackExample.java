package sg.edu.nus.iss;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    //how to combine all into one functional interface; where we write the actual logic
    public static void example(){
        Stack<Integer> stack = new Stack<Integer>();

        //FILO OR LIFO concept
        for (int i = 0; i < 5; i++){
            //first in last out, last in first out
            //pushing or putting something on the stack
            stack.push(i);
        }

        //pop or taking sthm from the stack - pop will remove somethinf from the stack
        for (int i = 0 ; i<10; i++){
            Integer stackItem = stack.pop();
            System.out.println("Stack item(pop): " + stackItem);
        }

        //see what is the last item from the top of the stack\
        Integer item = stack.peek();
        System.out.println(item);

        Integer firstItem = stack.firstElement();
        System.out.println(firstItem);

        // stack.search(firstItem);
        Integer idxElement = stack.search(2);
        System.out.println("Stack element found at index " + idxElement);

        //iterating through 
        Iterator<Integer> its = stack.iterator();
        while(its.hasNext()) {
            Integer stackIt = its.next(); 
            System.out.println("Iterator stack item: " +  stackIt);
        }
    }
}
