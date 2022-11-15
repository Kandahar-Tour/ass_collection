import static java.lang.Thread.sleep;

public class Multithreading {

    public static void main(String[] args) {
        threadtest tht = new threadtest();
        Thread t =  new Thread ();
        t.start();
    }
}
class threadtest implements Runnable{
   
    public void run(){
        System.out.println("threadtest.run() ");
       
        try {
        sleep (4500);
    }
        catch (InterruptedException ex){
            
        }
    }
}
