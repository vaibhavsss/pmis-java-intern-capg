package October_15;
class Box<T>{
    private T value;

    public Box(){}

    public Box (T value){
        this.value = value;
    }
    public T setItem(T value){
        this.value = value;
        return value;
    }
    public T getValue(){
        return value;
    }
}
public class genericClass {
    public static void main(String[] args) {
        //string testing
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Samsung");
        String ss = stringBox.getValue();
        System.out.println(ss);

        //Integer testing
        Box<Integer> intBox = new Box<>();
        intBox.setItem(25000);
        Integer price = intBox.getValue();
        System.out.println(price);

    }
}
