import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {
        String [] names=new String[]{"Manish singh","atul","Sunny","Asksh","Sujeets"};
      Stream<String> namesStream =  Arrays.stream(names);
         List<String> modifiedValues = namesStream.map(nameStream -> nameStream.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println(modifiedValues);
        List<String> lowecaseData = Stream.<String>builder().add("Shashi").add("Rakesh").add("Nambi").build().map(m -> m.toLowerCase()).sorted().collect(Collectors.toList());
        System.out.println(lowecaseData);
        Stream<String> raks = lowecaseData.stream().filter(m -> m.startsWith("r"));
        System.out.println(Arrays.asList(raks.toArray()));
        Integer value = Stream.of(8, 2, 4, 6).findAny().get();
        System.out.println(value);

    }
}
