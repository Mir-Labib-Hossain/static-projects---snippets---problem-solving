package thread;
public class A implements Runnable{
    public void run(){
        for(int i=0; i<=5; i++)
        {
             try{
            Thread.sleep(200);
            }
            
                catch(InterruptedException e)
                        {
                        System.out.println(e);
                        }
        System.out.println(Thread.currentThread().getId()+" "+Thread.currentThread().getName()+" "+i);
        } 
    }
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();
        
        Thread t1 = new Thread(a1,"thread 1");
        Thread t2 = new Thread(a2,"thread 2");
        Thread t3 = new Thread(a3,"thread 3");
        Thread t4 = new Thread(a4,"thread 4");
        Thread t5 = new Thread(a5,"thread 5");
       
        
        t1.start();
        t2.start();
        t3.start();
        try{
            t3.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        t4.start();
        t5.start();
    }
}