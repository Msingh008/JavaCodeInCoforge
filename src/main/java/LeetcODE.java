import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LeetcODE {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        ArrayList<Character> equivalanetChars = new ArrayList<>();
        Map<Character, Object> map = new HashMap<>();
        String result = "";
        for (int i = 0; i < baseStr.length(); i++) {
            if (s1.contains(String.valueOf(baseStr.charAt(i))) && s2.contains(String.valueOf(baseStr.charAt(i)))) {
                int indexS1 = s1.indexOf(baseStr.charAt(i));
                int indexS2 = s2.indexOf(baseStr.charAt(i));
                equivalanetChars.add(s1.charAt(indexS2));
                equivalanetChars.add(s2.charAt(indexS1));
                Collections.sort(equivalanetChars);
                result += String.valueOf(equivalanetChars.get(0));

            }

            if (s1.contains(String.valueOf(baseStr.charAt(i))) && !s2.contains(String.valueOf(baseStr.charAt(i)))) {
                int indexS1 = s1.indexOf(baseStr.charAt(i));
                equivalanetChars.add(s2.charAt(indexS1));
                equivalanetChars.add(baseStr.charAt(i));
                Collections.sort(equivalanetChars);
                result += String.valueOf(equivalanetChars.get(0));

            }

            if (!s1.contains(String.valueOf(baseStr.charAt(i))) && s2.contains(String.valueOf(baseStr.charAt(i)))) {
                int indexS2 = s2.indexOf(baseStr.charAt(i));
                equivalanetChars.add(s1.charAt(indexS2));
                equivalanetChars.add(baseStr.charAt(i));
                Collections.sort(equivalanetChars);
                result += String.valueOf(equivalanetChars.get(0));

            }
        }
return result;
    }
}
