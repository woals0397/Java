public class test {
    public static void main(String[] args) {
        // Runnable 함수형인터페이스
        Thread thread = new Thread(() -> {System.out.println(Thread.currentThread() + "running"); System.out.println("AA");});
        thread.start();


    }
}
