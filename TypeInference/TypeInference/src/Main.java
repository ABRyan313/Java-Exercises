import java.io.Serializable;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static <T> T pick(T a1, T a2){
        return a2;
    }
    public static void main(String[] args) {

        Serializable s = pick("d", new ArrayList<String>());
        System.out.println(s.getClass().getName());

    }
}