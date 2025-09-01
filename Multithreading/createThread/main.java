package Multithreading.createThread;

public class main {
    public static void main(String[] args) {
//        Create_Thread thread = new Create_Thread(); // Create object
//
//        thread.start();// start method to start thread

        Runnable_interface runnable = new Runnable_interface(); // If we Implement Runnable, first create object
        Thread t1 = new Thread(runnable);   // after that we have to create Thread object and pass runnable interface
                                            // in this constructor
        
        t1.start(); // then we stat thread
        for (int i=0; i<=1000; i++) {
            System.out.println("Hello");
        }
    }
}
