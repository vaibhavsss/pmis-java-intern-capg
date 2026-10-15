package October_15;
class Box<T>{
    private T value;

    // empty constructor (required for `new Box<>()`)
    public Box(){}

    // Parameterized constructor
    public Box (T value){
        this.value = value;
    }
    // setter method used 
    public T setValue(T value){
        this.value = value;
        return value;
    }
    // getter method used
    public T getValue(){
        return value;
    }
}
public class genericCode1 {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setValue("hello");
        String s = box.getValue();
        System.out.println(s);
    }
}
