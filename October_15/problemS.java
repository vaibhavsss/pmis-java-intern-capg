package October_15;
class Locker<T>{
    private T item;

    void put(T item){
        this.item = item;
    }
    T get(){
        return item;
    }
}
public class problemS {
    public static void main(String[] args) {
        Locker<String> l1 = new Locker<>();
        l1.put("Java Book");
        System.out.println("The locker has: " + l1.get());

        Locker<Integer> intLocker = new Locker<>();
        intLocker.put(1234);
        intLocker.put(1111);
        intLocker.put(20201);


        System.out.println("IntLocker has: "  + intLocker.get());
    
    }
}
