package October_12.inheriTance;
// code example for "has-a-relation"
public class mainApp {
    public static void main(String[] args) {
        Address location1 = new Address("Mumbai", "Maharashtra", 400071);
        Student virat = new Student("Virat", 21, location1);
        virat.displayProfile();
    }
}
