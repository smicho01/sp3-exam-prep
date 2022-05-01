package jointhreads;

public class TestJoinClass extends  Thread {

    public TestJoinClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i<5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " i = " + i);
        }
    }
}
