package Java_Thread_and_Concurrency;

import static Java_Thread_and_Concurrency.ThreadColor.ANSI_GREEN;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println(ANSI_GREEN + "Hello from " + currentThread().getName());

        try{ Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            System.out.println(ANSI_GREEN + "another thread woke me up");
            return;
        }
        System.out.println(ANSI_GREEN + "3 seconds have passed, now I'm awake");
        for(int i = 0; i < 2; i++) {
        System.out.println("tell me what you want");
        }
    }
}
