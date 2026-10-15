package October_15;
import java.util.*;

//unbounded wild card
public class wildCards {
    public static void printList(List<?> list){
        for (Object o : list){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Banana", "Wadapav");
        List<Integer> nums = Arrays.asList(1222,1222,1222,1222);
        printList(nums);
        printList(names);
    }
}
