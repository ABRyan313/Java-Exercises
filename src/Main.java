import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



// Define a generic Box class
        class Box<T> {
            private T item;

            public void set(T item) {
                this.item = item;
            }

            public T get() {
                return item;
            }
        }

        public static <U> void addBox(U u, List<Box<U>> boxes){
            Box<U> box = new Box<>();
            box.set(u);
            boxes.add(box);
        }


    }
}