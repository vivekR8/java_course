public class FibonacciRunnable {
    public static void main(String[] args) throws InterruptedException {
        FibonacciThread ob= new FibonacciThread();
        Runnable r1=()-> ob.Fibonacci();
        Runnable r2=()-> ob.expectedResult();

        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
//        Runnable runnable=()->{
//            System.out.println("Here Is Running Thread " + Thread.currentThread().getName() );
//        };
//        Thread t= new Thread(runnable);
//        t.start();
//        t.setName("my Name");


    }
}
