import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("AB");
        names.add("Rojoni");
        names.add("Audri");
        names.add("Kajol");

        SearchHandler list = new SearchHandler(names);

        System.out.println(list.Search("AB"));

    }
}