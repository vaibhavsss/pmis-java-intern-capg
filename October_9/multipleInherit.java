package October_9;
interface Father{
    void isPa();
}
interface Mother{
    void isMa();
}
class Baby implements Father, Mother{
    Baby(){
        System.out.println("I'm just a baby!");
    }
    @Override 
    public void isPa(){
        System.out.println("This is the Father");
    }
    @Override 
    public void isMa() {
        System.out.println("This is the Muma");
    }
}
public class multipleInherit {
    public static void main(String[] args) {
        Baby obj = new Baby();
        obj.isPa();
        obj.isMa();
    }
}
