package raceandsynchronization;

public class RaceExample {

    static double a =  10;
    static double b;

    public static void main(String[] args) {

        //** EXAMPLE OF RACE **//

        Runnable r1 = new Runnable() {
            @Override
            public void run() {

                // Check if a = 10 and then execute conditional code
                if( a == 10 )
                    try {
                        Thread.sleep(0); // race as delay is 0
                        //Thread.sleep(500); // data race as delay is not 0
                        b = a / 2.0;
                        System.out.println(Thread.currentThread().getName() + " b = " + b);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
            }
        };

        Runnable r2 = () -> a = 12;

        Thread tA = new Thread(r1, "Thread A");
        Thread tB = new Thread(r2, "Thread B");

        tA.start();
        tB.start();

        // IF b = 6.0 then the code in r1 IF statement should never run !!!

    }

}
