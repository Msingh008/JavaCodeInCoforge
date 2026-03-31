package RandomPractices;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Employee {
    int id;
    String Name;
    float salary;
    boolean active;
   private Employee(int id,String name,float salary,boolean active){
        this.id=id;
        this.Name=name;
        this.salary=salary;
         this.active=active;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 66, 33, 12, 10, 1));
        Stream<Integer> s1 = numbers.stream().filter(x -> {
            System.out.println("filtering x= " + x);
            return x > 10;
        });
        Stream<Integer> s2 = s1.sorted((x, y) -> {
            System.out.println("Comparing : " + x + " with : " + y);
            return Integer.compare(x, y);
        });
        List<Integer> result = s2.collect(Collectors.toList());
        System.out.println("final result: " + result);
        System.out.println("Adding this line to rigger build..");

    }

}
