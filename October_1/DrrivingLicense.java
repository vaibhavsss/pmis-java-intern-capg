public class DrrivingLicense {
    public static void main(String[] args) {
        int age = 16;
        boolean hasDrivingLicense = false;
        if (age>=18 && hasDrivingLicense) {
            System.out.println("You can drive");
        } else if (age>=18 && !hasDrivingLicense) {
            System.out.println("You need license to drive");
        } else {
            System.out.println("You need to be at least 18");
        }
    }
}
