package jointhreads;

public class TestJoin {

    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10; i++) {
                    System.out.println(Thread.currentThread().getName() + " incrementing i : " + i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10; i++) {
                    System.out.println(Thread.currentThread().getName() + " incrementing i : " + i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10; i++) {
                    System.out.println(Thread.currentThread().getName() + " incrementing i : " + i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        Thread t1 = new Thread(r1, "\033[0;31m" + "Thread T1 " + "\033[0m");
        Thread t2 = new Thread(r2, "\033[0;33m"+ "Thread T2 ££££££££££££££££££" + "\033[0m");
        Thread t3 = new Thread(r3, "Thread T3 ------------------");


        t1.start();
        t1.join();
        t2.start();
        t3.start();

        System.out.println("\n\n\n");

         t1 = new Thread(r1, "\033[0;31m" + "Thread T1 " + "\033[0m");
         t2 = new Thread(r1, "\033[0;33m"+ "Thread T2 ££££££££££££££££££" + "\033[0m");
         t3 = new Thread(r1, "Thread T3 ------------------");

         t1.start();
         t1.join();
         t2.start();
         t3.start();
    }
}
