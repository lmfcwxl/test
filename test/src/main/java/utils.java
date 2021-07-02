

public class utils {
    public static void main(String[] args) {
        thread1 t = new thread1();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}
