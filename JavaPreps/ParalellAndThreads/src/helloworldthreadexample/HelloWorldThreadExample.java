package helloworldthreadexample;



public class HelloWorldThreadExample {

    private static String result = "";

    public static void main(String[] args) throws InterruptedException {
        Thread helloThread = new Thread(() -> hello());
        Thread worldThread = new Thread(() -> world());

        helloThread.start();
        worldThread.start();

        helloThread.join();
        worldThread.join();

        System.out.println("Res: " + result);
    }

    private static void hello() {
        result  = result.concat("Hello");
    }

    private static void world() {
        result = result.concat(" World");
    }
}
