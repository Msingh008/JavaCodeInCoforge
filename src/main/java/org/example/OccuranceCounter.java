package org.example;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccuranceCounter {
    public static void main(String[] args) {
        String name="Alice in wonderLand lalaiw o O W";
        System.out.println(name.indexOf("wonder"));
        HashMap<Character,Integer> occuranceCounterMap=new HashMap<>();
        for(int i=0;i<name.length();i++){
            occuranceCounterMap.put(name.charAt(i),occuranceCounterMap.getOrDefault(name.charAt(i),0)+1);

        }
        System.out.println(occuranceCounterMap);
    }

    public static class RegexPractice {
        public static void main(String[] args) {
            Pattern pattern=Pattern.compile("gmail.com");
            Matcher y = pattern.matcher("ahddhdds@gmail.com");
            System.out.println(y);
        }
    }
}
