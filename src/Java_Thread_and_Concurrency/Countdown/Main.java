package Java_Thread_and_Concurrency.Countdown;

public class Main {
    public static void main(String[] args) {

        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();


    }
}

class Countdown {
    private int i;
    public void doCountdown () {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = CountdownColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = CountdownColor.ANSI_BLUE;
                break;
            default:
                color =CountdownColor.ANSI_BLACK;
        }
        synchronized (this) {  /* we are synchronizing the Countdown object to prevent race condition */
        for( i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": i=" + i);
        }
        }
    }
}

class CountdownThread extends Thread {  /* the CountdownThread extends Thread in order to create a new thread */
    private Countdown countdown;

    public CountdownThread (Countdown countdown) {
        this.countdown = countdown;
    }

//    public void run () {
//        countdown.doCountdown();
//    }

    @Override
    public void run() {
        countdown.doCountdown();
    }
}


