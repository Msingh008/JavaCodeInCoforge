import java.util.HashMap;
import java.util.Map;

public class CountCharOccuranceUsingMap {
    public static void main(String[] args) {
        String input = "aaaBBCCCCDBaCaA";
        input=input.toLowerCase();
        int count = 1;

        Map<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {

            if (counter.containsKey(input.charAt(i))) {
                counter.put(input.charAt(i),counter.get(input.charAt(i))+1);
            } else {
                counter.put(input.charAt(i), count);
            }

        }
        System.out.println(counter);
    }

}
