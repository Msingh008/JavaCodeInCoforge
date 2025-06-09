import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {
        String input="My name is Mnaish";
        String[] rawOutput =input.split("[^A-Z^a-z]");
        System.out.println(rawOutput.length);
        for (String i:rawOutput)
                System.out.println(i);

        }

    }

