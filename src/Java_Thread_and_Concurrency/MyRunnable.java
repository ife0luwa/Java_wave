package Java_Thread_and_Concurrency;

import static Java_Thread_and_Concurrency.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from myRunnable implementation of run" );
    }
}
