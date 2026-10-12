package October_12.hasA;

public class hasMain {
    public static void main(String[] args) {
        Battery b1 = new Battery(5000);
        Camera c1 = new Camera(31201440);
        Phone samsung = new Phone("Samsung", b1, c1);
        samsung.workingPhone();
    }
}
