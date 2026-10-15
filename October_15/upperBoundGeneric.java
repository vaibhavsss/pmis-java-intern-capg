package October_15;
import java.util.*;
public class upperBoundGeneric {
    static double sum(List<? extends Number> list){
        double total = 0;
        for (Number n : list){
            total += n.doubleValue();
        }
        return total;
    }
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3);
        List<Float> floats = List.of(0.1f,2.5f,22.2f);
        List<Double> doubles= List.of(0.1,0.2,0.3);

        System.out.println(sum(integers));
        System.out.println(sum(floats));
        System.out.println(sum(doubles));

    }
}
