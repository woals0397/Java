package ch04;

class Worker{
    public void work(){
        for(int i = 0; i < 100; i++)
            System.out.println("Working");
    }
}

class ConcurrentWorker extends Worker{
    public void work(){
        Thread t = new Thread(super::work);
        t.start();
    }
}
public class superMethodExpression {
    public static void main(String[] args) {

    }
}
