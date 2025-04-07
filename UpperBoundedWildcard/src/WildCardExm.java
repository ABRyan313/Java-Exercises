import java.util.List;

public class WildCardExm {

    private List<? extends Number> numbers;

    public WildCardExm(List<? extends Number> numbers){
        this.numbers = numbers;
    }



    public double calculateSumd(){
        double sum = 0;
        for(Number n: numbers){
            sum += n.doubleValue();
        }
        return sum;
    }

    public int calculateSumI(){
        int sum = 0;
        for(Number n: numbers){
            sum += n.intValue();
        }
        return sum;
    }

//    public <T> List<? extends Number>  calculateSum(){
//        double sum = 0;
//        for(Number n: numbers){
//            sum += n.doubleValue();
//        }
//        return sum;
//    }

}
