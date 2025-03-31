import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");

        Set<Integer> keys = map.keySet();
        System.out.println("keys = " + keys);

        Collection<String> values = map.values();
        System.out.println("values = " + values);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("entries = " + entries);

    }
}

