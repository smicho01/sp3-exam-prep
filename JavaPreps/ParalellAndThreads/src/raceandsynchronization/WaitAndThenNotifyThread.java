package raceandsynchronization;

public class WaitAndThenNotifyThread {

    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        threadB.start();
        synchronized (threadB) {
            try {
                System.out.println("Waiting for second thread to complete its task ...");
                threadB.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Waiting is done. Value of Total is = " + threadB.total);
        }
    }


}

class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i < 10 ; i++){
                total += i;
            }
            notify();
        }
    }
}