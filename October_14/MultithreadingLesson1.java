package October_14;
/*
start() - starts a thread. 
run() - defines the task that the thread executes.
You should not call start() a second time on the same thread object;
Java will throw IllegalThreadStateException 
*/
class NumberThreads extends Thread{
    @Override 
    public void run(){     //this is a method from Thread class
        for (int i=1;i<=3;i++) {
            System.out.println("Thread Started: "+ i);
        }
    }
}
public class MultithreadingLesson1 {
    public static void main(String[] args) {
        NumberThreads t1 = new NumberThreads();
        t1.start();           // object 

        for (int i = 1; i <=3 ; i++) {
            System.out.println("Main Started: " + i);
        }
    }
}
