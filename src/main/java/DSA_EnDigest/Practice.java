package DSA_EnDigest;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
        String name= "ManIsh KuMar";
        String[] ipr = name.split("");
        String result = Arrays.stream(name.split("")).reduce("", (a, b) -> b + a);
        System.out.println("Reversed String "+result);
        List<String> lstIpr=new ArrayList<>(List.of(ipr));
        lstIpr.removeIf(m->Character.isUpperCase(m.charAt(0)));
        String res=lstIpr.stream().reduce("",(a,b)->b+a);
        System.out.println(res);
        Comparator<Float> multiplication = (a, b) -> (int)(a * b);
        System.out.println(multiplication.compare(9.24f,1.6f));
        Map<String,Integer> ageData=new HashMap<>(Map.of("Manish",28,"Sunil",45,"Sujeet",33));
        //ageData.values().stream().



    }
}
