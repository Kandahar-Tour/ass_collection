
package exception1;

public class Exception1 {

    public static void main(String[] args) {
        
        try {
            int x = 20;
            int y = 0;
            int division = y/x;
            
            System.out.println("division of this numbers is " + division);
        }
        catch (Exception e){
            System.out.println("y number is not division for x number:");
        }
    }
}
