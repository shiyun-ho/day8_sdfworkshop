package sg.edu.nus.iss;

import java.util.Arrays;
import java.util.Collections;

//collections are list and objects
//array is like Integer num [] OR String num[]

public class ArraySortExample { 
    public void example(){
        //put in data, declares data inside
        //custom array with data 
        String name[] = {"darryl", "elaine", "james", "chris", "mark", "sophia",
        "asher", "brandon", "helen", "daniel"};

        //prints out unsorted array
        System.out.println("Unsorted array: " + Arrays.toString(name));

        //sort the array in ascending order
        Arrays.sort(name);

        //prints sorted array
        System.out.println("Sorted Array:" + Arrays.toString(name));

        //sorts array in descending order
        Arrays.sort(name, Collections.reverseOrder());

        System.out.println("Sorted arr: (reverse) " + Arrays.toString(name));
        //to execute, need to call it in the main function
    }

    public void example2(){
        //different ways of putting into array
        // Integer numbers[] ={10, 5, 2, 3, 4, 5}
        int[] numbers ={10, 5, 2, 3, 4, 5};

        Arrays.sort(numbers);

        System.out.println("Sorted numbers " + numbers);
    }
    
}
