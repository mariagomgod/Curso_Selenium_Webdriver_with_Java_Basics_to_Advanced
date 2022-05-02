import org.junit.Test;
import java.util.ArrayList;
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
    }

}
