package threads.basics;

import static threads.ThreadColor.ANSI_BLUE;

public class OtherThread extends Thread {


    @Override
    public void run() {
        System.out.println(ANSI_BLUE + " thread name : " + currentThread().getName());

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + " somebody woke me up");
        }
        System.out.println(ANSI_BLUE + " enough sleeping, back to work!!");
    }
}
