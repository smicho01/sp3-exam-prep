package states;

public class ThreadStates {

    public static void main(String[] args) throws InterruptedException {
        System.out.printf("%s thread is %s alive and in %s" +
                " state%n and priority %d\n",
                Thread.currentThread().getName(),
                Thread.currentThread().isAlive() ? "" : "not",
                Thread.currentThread().getState(),
                Thread.currentThread().getPriority()
                );

        Runnable r1 = () -> {
            Thread tr1 = Thread.currentThread();
            System.out.printf("%s is %salive and in %s " +
                            "state%n and priority %d \n", tr1.getName(),
                    tr1.isAlive() ? "" : "not ",
                    tr1.getState(), tr1.getPriority());
        };

        Thread t1 = new Thread(r1, "THREAD t1");
        t1.setPriority(9);
        System.out.printf("%s thread is %s alive and in %s" +
                        " state%n and priority %d\n",
                t1.getName(),
                t1.isAlive() ? "" : "not",
                t1.getState(),
                t1.getPriority()
        );
        t1.start();

        Thread t2 = new Thread(r1);
        t2.start();

        // Put main thread to sleep
        Thread.sleep(2000);

        System.out.println("ACTIVE THREADS COUNT : " + Thread.activeCount());

        t2.setName("Thread t2");
        System.out.printf("%s is %salive and in %s " +
                        "state%n and priority %d \n", t2.getName(),
                t2.isAlive() ? "" : "not ",
                t2.getState(),
                t2.getPriority());


        //print info about current thread
        System.out.printf("%s is %salive and in %s " +
                        "state%n and priority %d \n", Thread.currentThread().getName(),
                Thread.currentThread().isAlive() ? "" : "not ",
                Thread.currentThread().getState(),
                Thread.currentThread().getPriority());
    }
}
