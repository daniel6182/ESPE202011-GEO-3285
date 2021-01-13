
package iterations;
import java.util.Scanner;
import java.math.*;

public class Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        i = 0;

        System.out.println("==== This is a while loop from 1 to 49 ====");

        while (i < 49) {
            System.out.println("i -> " + (i + 1));
     i++;
     
    }
        
    System.out.println("Multiplication Tables : 49");
        int top=12;
        int product=0;
        int table = 49;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println("49 * " + j + " = " + product);
        }
    
         
        
    
Scanner pot=new Scanner (System.in);
        int x,n=5;
        
        for(x=1;x<=12;x++)
        {
            int resultado=(int)Math.pow (n,x);
            
            System.out.println("El resultado es:" +resultado);
             } 
         }
      }
    


           
            
            
             

    
     
    
    
