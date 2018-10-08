package ch03;

class HelloTask implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println("Hello, World");
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        Runnable task = new HelloTask();
        Thread thread = new Thread(task);
        thread.start();
    }
}
