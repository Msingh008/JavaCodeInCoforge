package java8.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnerClass {
   static int x=100;

   static EmployeeInterface ep=()->{
       x=200;
       System.out.println(x);

       return  "Software Engineer";
    };

    public static void main(String[] args) {
        System.out.println(ep.returnDesignation());
    }



}
