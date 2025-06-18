import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {
        String input = "Automate MANISH RomanSipka";
        CollectionsPractice.convertUpperToLowerCaseandViceVersa(input);
        System.out.println();
        System.out.println();


        List<String> output = new ArrayList<>();
        String[] arrayInput = input.split(" ");
        for (String s : arrayInput) {
            if (s.contains("a")) {
                int indexa = s.indexOf('a');
                String startingPart = s.substring(0, indexa);
                String endPart = s.substring(indexa + 1, s.length());
                StringBuilder sb = new StringBuilder();

                StringBuilder sb1 = new StringBuilder(startingPart).reverse();
                sb.append(endPart).reverse().append('#').append(sb1.toString());
                output.add(sb.toString());

            }
            if (s.contains("S")) {
                int indexS = s.indexOf('S');
                String startingPart = s.substring(0, indexS);
                String endPart = s.substring(indexS + 1, s.length());
                StringBuilder sb = new StringBuilder();
                StringBuilder sb1 = new StringBuilder(startingPart).reverse();
                sb.append(endPart).reverse().append('$').append(sb1.toString());
                output.add(sb.toString());
            }
        }
        for (int i = output.size() - 1; i >= 0; i--) {
            System.out.print(output.get(i) + " ");
        }
    }

     static public void  convertUpperToLowerCaseandViceVersa(String input) {
        for (int i = 0; i < input.length(); i++) {
            if ((Character.isUpperCase(input.charAt(i)))) {
                System.out.print(Character.toLowerCase(input.charAt(i)));
            }
            if ((Character.isLowerCase((input.charAt(i))))) {
                System.out.print(Character.toUpperCase(input.charAt(i)));
                System.out.println();
            }
            if(!Character.isAlphabetic(input.charAt(i)))
            System.out.print(input.charAt(i));
            System.out.println("Chages made by Atul...........");

            //Just a random changeq
        }
    }

}
