package Multithreading.createThread;

public class Create_Thread extends Thread { // First extend Thread class
    @Override
    public void run() { // override run method
        for (int i=0; i<=1000; i++){
            System.out.println("World");
        }
    }
}

