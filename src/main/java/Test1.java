import org.junit.Test;
import java.util.ArrayList;

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

        names.stream().filter(s -> s.startsWith("A"));
    }

}
