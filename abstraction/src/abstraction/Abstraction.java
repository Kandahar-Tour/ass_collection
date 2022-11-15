
package abstraction;

public class Abstraction {

   
    public static void main(String[] args) {
        car f = new farare();
        f.acceleration();
       
    }
}
abstract class car{
   abstract void acceleration();
    }
}
class farare extends car{
    
    void acceleration(){
        System.out.println("abstraction.farare.acceleration()");
    
    }
}

