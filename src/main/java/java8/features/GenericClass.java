package java8.features;

import java.util.Comparator;

public class GenericClass implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b-a;
    }
}
