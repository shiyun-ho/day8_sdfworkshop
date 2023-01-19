package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSortExample {
    public void example01() {
        // collections is dynamic, can keep adding elements
        // arrays is fixed
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            // randomly generate numbers up to 100, * 100 representes 0-100
            numbers.add((int) (Math.random() * 100));
            // Math.random returns as double, cast as integer by addint (int)
        }

        // print unsorted list
        System.out.println("Unsorted list " + numbers);
        // sort in ascending
        Collections.sort(numbers);
        // print the sorted list
        System.out.println("Sorted list: " + numbers);

        // sort in descending
        // Collections.sort(numbers, Collections.reverseOrder());
        //alternatively, we can use comparator as it uses a list object
        numbers.sort(Comparator.reverseOrder());

        // print sorted list
        System.out.println("sorted list (reverse) " + numbers);
    }

    public static void main(String[] args){
        CollectionSortExample abc = new CollectionSortExample();
        abc.example01();
    }

    public void example02(){
        Employee emp1 = new Employee("12345", "John Smith", "SS", "Lecturer", "abc@example.com", 2000);
        Employee emp2 = new Employee("23433", "Jane Smith", "SS", "Lecturer", "abc@example.com", 2000);
        Employee emp3 = new Employee("43232", "Doe Smith", "SS", "Lecturer", "abc@example.com", 2000);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("employees before sorting: " + employees);

        //sort by ascending order using collectioons
        Collections.sort(employees);

        //print out sorted
        System.out.println("employees after sorting "+ employees);

        //using Comparator and Lamda
        employees.sort(Comparator.comparing( e -> e.getSalary()));
        System.out.println("Sorted employees (salary): " + employees);

        List<Employee> filteredEmployees = employees.stream().filter(e -> e.getFullName().equalsIgnoreCase("darryl ng")).collect(Collectors.toList()); 
        //as filter returns a collections, return as list
        System.out.println("Filtered  employees: " + filteredEmployees);
    }
}
