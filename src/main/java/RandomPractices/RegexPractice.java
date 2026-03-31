package RandomPractices;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("-");
        Matcher xyz = pattern.matcher("123-456-789");
        String[] spl = pattern.split("123-456-789");
        for(String i:spl){
            System.out.println(i);
        }
       }

    }

