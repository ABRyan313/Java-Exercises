import java.util.ArrayDeque;
import java.util.Deque;

public class HashConverting {

    private Deque<String> number;
    //private int HashNumber;

    public HashConverting(){
        this.number = number;
    }

    public Deque<Integer> conversion(Deque<String> number) {

        Deque<Integer> myDeque = new ArrayDeque<>();
        for (String n : number) {
            myDeque.add(n.hashCode());
        }
        return myDeque;
    }

}
