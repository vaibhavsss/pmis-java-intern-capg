package October_15;
class Util{
    static <T> void printOnce(T value){
        System.out.println(value);
    }
    static <T> T firstOf(T a, T b){
        return a;
    }
}
public class genericMtd {
    public static void main(String[] args) {
        Util.printOnce(120);
        System.out.println(Util.firstOf("Hi!", "Vlad"));
    }
}
