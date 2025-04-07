import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();

        list1.add(5);
        list1.add(5);
        list2.add(5.5);
        list2.add(5.5);

        WildCardExm wild = new WildCardExm(list1);
        WildCardExm wild2 = new WildCardExm(list2);

        System.out.println(wild.calculateSumI());
        System.out.println(wild2.calculateSumd());


    }
}