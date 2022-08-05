package lambda;

public class RunnableJavaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {  // old method for implementing runnable interface before jdk 1.8
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        // In jdk  1.8 implementing runnable interface using lambdas
        Runnable runnable1 = ()->{
            System.out.println("Inside Runnable 2");
        };

        new Thread(runnable1).start();
    }
}
