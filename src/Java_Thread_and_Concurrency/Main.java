package Java_Thread_and_Concurrency;

import static Java_Thread_and_Concurrency.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE + "Hello from the main thread"); /* this is the main thread */

        Thread anotherThread = new AnotherThread(); /* creating a different thread from the main  */
        anotherThread.setName("=== Another thread ==="); /* by creating a class that extends the Thread class */
        anotherThread.start();


        new Thread() {                  /* creating a different thread by using an anonymous thread class */
            public void run() {
                System.out.println(ANSI_BLACK + "Hello from the anonymous thread");
            }
        }.start();


        Thread myRunnableThread = new Thread(new MyRunnable());  /* creating a different thread by using the Runnable interface */
        myRunnableThread.start();                               /* which of course can be made anonymous too */
//        anotherThread.interrupt();


        Thread myRunnableThread2 = new Thread(new MyRunnable() {  /* here is the implementation of run by anonymous myRunnable object */
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous implementation of run");
                try{
                    anotherThread.join(4000);
                    System.out.println(ANSI_RED + "anotherThread terminated or timed out, now I'm running again");
                } catch (Exception e) {
                    System.out.println(ANSI_RED + "I couldn't wait, was interrupted");
                }
            }
        });
        myRunnableThread2.start();





    }
}
