package October_14;
/*
Java does not support multiple class inheritance.
Runnable is a built-in Java interface that represents a task that can be executed.

Runnable is often preferred because Java allows a class 
to implement multiple interfaces while extending only one class
*/

//Imagine an employee class already extends Person. You want it to run a report in the background.
class Chef{
    void justSit(){
        System.out.println("Chef is sitting idle.");
    }
}

class WokChef extends Chef implements Runnable{
    @Override 
    public void run(){
        System.out.println("The chef is cooking.");
    }
}
public class RunnableLesson {
    public static void main(String[] args) {
        WokChef c1 = new WokChef();
        c1.justSit();

        Thread worker = new Thread(c1);
        worker.start();

        System.out.println("Main thread.");
    }
}
