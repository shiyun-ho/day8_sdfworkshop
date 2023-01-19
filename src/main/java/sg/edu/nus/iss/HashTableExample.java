package sg.edu.nus.iss;

import java.io.Console;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    //Hashmap can be run in multiple threads, but hash table can only be run in single thread
    //hashmap  cannot allow null values, hashtable allows both to be null
    public void example(){
        Map<String, Integer> phones = new Hashtable<>();

        //puts into a hashmap, not first in first  out
        phones.put("iPhone", 10);
        phones.put("Huawei", 2);
        phones.put("Oppo", 5);
        phones.put("Nokie", 2);
        phones.put("Samsung", 8);

        System.out.println("Total phone type" + phones.size());

        //iterate through the map and print out; keySet - returns set that contains the key
        for (String key: phones.keySet()){
            System.out.println(key + "-" + phones.get(key));
        }

        //search for particular object in Map, use console.readline. Gets input from console and search
        String searchString = ""; 
        Console con = System.console();

        //keep getting user input until they type quit
        while (!searchString.equals("quit")){
            searchString = con.readLine("Enter searchString: ");

            if (phones.containsKey(searchString)){
                System.out.println(searchString + "-" + phones.get(searchString));
            } else {
                //console.input read line to check if it's not there
                System.out.println("item not found");
            }
        }

        //removes all data
        phones.clear();

        //check on the size of data
        System.out.println("Total phone types: " + phones.size());

    }

}
