import com.google.common.collect.Streams;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Test1 {

    @Test
    public void regular() {

        // Count the number of names starting with alphabet A in list.

        ArrayList<String> names = new ArrayList<String>();
        names.add("Adams");
        names.add("Violet");
        names.add("Alfred");
        names.add("Aleisha");
        names.add("Tom");

        int count = 0;

        for (int i = 0; i < names.size(); i++) {

            String actual = names.get(i);

            if (actual.startsWith("A")) {
                count++;
            }
        }
        System.out.println(count);
    }

    @Test
    public void streamFilter() {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Adams");
        names.add("Violet");
        names.add("Alfred");
        names.add("Aleisha");
        names.add("Tom");

        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);

        Long d = Stream.of("Adams", "Violet", "Alfred", "Aleisha", "Tom").filter(s -> {
                s.startsWith("A");
                return false;
        }).count();
        System.out.println(d);

        // Print all the names in an Arraylist.
        names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
    }

    @Test
    public void streamMap() {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Rosa");
        names.add("Pedro");
        names.add("Cristina");
        // Print names of letter end with a and convert it to Uppercase
        Stream.of("Adams", "Violet", "Alfred", "Aleisha", "Tom").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
        // Print names of letter end with a and convert it to Uppercase
        List<String> names1 = Arrays.asList("Adams", "Violet", "Alfred", "Aleisha", "Tom");
        names1.stream().filter(s -> s.endsWith("A")).sorted().map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));
        // Merging 2 different lists
        Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
        newStream.sorted().forEach(s -> System.out.println(s));
    }

}
