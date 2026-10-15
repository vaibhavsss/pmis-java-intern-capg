package October_15;

// Multi Type parameters
class Pair<J, K>{
    private J key;
    private K value;

    // Parametrized constructor.

    Pair(J key, K value){
        this.key = key;
        this.value = value;
    }
    J getKey(){
        return key;
    }
    K getValue(){
        return value;
    }
}
public class genericMultiType {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Age", 21);
        String J = p.getKey();
        Integer K = p.getValue();

        System.out.println(J + " : " + K);
    }
}
