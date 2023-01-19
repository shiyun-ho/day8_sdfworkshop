package sg.edu.nus.iss;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public void example(){
        Map<String, Integer> laptops = new ConcurrentHashMap<>();
        laptops.put("Acer",5);
        laptops.put("Apple",185);
        laptops.put("MSI",25);
        laptops.put("Asus",51);

        System.out.println("Total laptops: " + laptops.size());

        //iterate through the entire map using keyset method
        for(String key: laptops.keySet()){
            System.out.println(key + "-" + laptops.get(key));
        }

        String searchString = "asus";
        if (laptops.containsValue(searchString)){
            System.out.println(searchString + " - " + laptops.get(searchString));
        }

        //use enumeration to enumerate a map
        Enumeration<Integer> elems = ((ConcurrentHashMap<String, Integer>) laptops).elements();
        while(elems.hasMoreElements()){
            System.out.println(elems.nextElement());
        }

        Integer retValue = laptops.putIfAbsent("Apple", 25);
        if (retValue!= null){
            System.out.println("item found: " + retValue);
        }

        searchString = "Apple"; 
        if (laptops.containsKey(searchString)){
            System.out.println(searchString + "-" + laptops.get(searchString));
        }

        retValue = laptops.putIfAbsent("Microsoft", 18);

        for (String key: laptops.keySet()){
            System.out.println(key + "-" + laptops.get(key));
        }
    }
}
