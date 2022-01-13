package thread_synchronized;
public class Synchronized extends Thread{
    public void run(){
           meth();
    }
    
    static synchronized void meth(){
    for(int i=0; i<3; i++)       
    {
        try{
           sleep(10);
        }   
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println(i+"\t"+currentThread().getName()+"\t"+currentThread().getId());
    }
    }
    public static void main(String[] args) {
        Synchronized t1 = new Synchronized();
        Synchronized t2 = new Synchronized();
        Synchronized t3 = new Synchronized();
        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
    
}
