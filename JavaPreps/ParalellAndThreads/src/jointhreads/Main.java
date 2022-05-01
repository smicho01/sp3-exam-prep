package jointhreads;

public class Main {

    public static void main(String[] args) {
        TestJoinClass t1 = new TestJoinClass("t1");
        TestJoinClass t2 = new TestJoinClass("t2");
        TestJoinClass t3 = new TestJoinClass("t3");

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Thread 3 won't start until thread 2 is complete
        t3.start();
    }
}
