package creatingthreads.kittens;

public class Main {

    public static void main(String[] args) {

        (new Thread(new KittensRunnable())).start();

        (new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Embedded Runnable in Action!");
            }
        })).start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Long body runnable thing!");
            }
        };


        Thread t1 = new Thread(r1, "Thread T1 with that long runnable");
        t1.start();

        Runnable r2 = () -> System.out.println( Thread.currentThread().getName() +  "Lambda version of runnable");
        Thread t2 = new Thread(r2, "Short Runnable as Lambda");
        t2.start();

    }
}
