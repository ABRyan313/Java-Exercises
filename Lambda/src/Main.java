import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Using lambda expressions to print a message
        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name.toUpperCase()));

        //Sorting numbers in ascending and descending order
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        numbers.sort((a, b) -> a - b);
        System.out.println("Ascending: " + numbers);
        numbers.sort((a, b) -> b - a);
        System.out.println("Descending: " + numbers);

        //Using lambda expressions to filter and print even and odd numbers
        numbers.forEach(n -> {
            if(n%2 == 0){
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        });
    }
}