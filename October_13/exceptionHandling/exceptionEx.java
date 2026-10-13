package October_13.exceptionHandling;

public class exceptionEx {
    public static void main(String[] args) {
        try {
            int[]arr= {1,2,3,4,5,66};
            System.out.println(arr[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Stay in limit son.");
        }finally{
            System.out.println("Im here");
        }
    }
}
