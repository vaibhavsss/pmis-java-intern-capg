package October_9;
// Hierarchical Inheritance
class Bird{
    void isBird(){
        System.out.println("Bird");
    }
}
class canFly extends Bird{
    void isFlying() {
        System.out.println("This bird can Fly");
    }
}
class cannotFly extends Bird{
    void notFlying() {
        System.out.println("Bird not Fly!");
    }
}
public class heirarChy {
    public static void main(String[] args) {
        canFly fly = new canFly();
        cannotFly noFly = new cannotFly();
        fly.isFlying();
        noFly.notFlying();
    }
}
