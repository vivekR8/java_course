

public  class FibonacciThread {
    private int x=0;
    private int y=1;
    private int e=1;
    private final int count=20;
    public int answer;



     public final Object key= new Object();
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

     public void Fibonacci() {
        synchronized (key){
         //System.out.println("\n"+1);
         answer=0;
         for(int i=1;i<count;i++){
             answer= x+y;
             //System.out.println("Fibonacci" +answer);
             setX(y);
             setY(answer);
             //if(!pause) {
                 try {
                     //pause=true;
                     key.wait();
                 } catch (InterruptedException ex) {
                     System.out.println(ex);
                 }
             //System.out.println(Thread.currentThread().getName() + " ---- " + i);

             //}
             key.notifyAll();
         }
        }
     }

    public void setE(int e) {
        this.e = e;
    }

    void expectedResult() {
        int result=1;
        synchronized (key) {
            System.out.println(0+ " + "+1+" = "+ result);
            for(int i=1;i<count;i++){
            int n = answer;
                System.out.println(e +" + "+ n+" = "+ e);
                e=e+n;

                key.notifyAll();

                //if(pause) {
                try {
                    //pause = false;
                    key.wait();
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }

                //}
        }}
    }
 }
