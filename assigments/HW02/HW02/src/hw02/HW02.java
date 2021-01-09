
package hw02;
import java.util.Scanner;


public class HW02{
    
    
    public static void main(String[]args) {
        // Your code here!
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Calcular el area del rectangulo");
        
        System.out.println("Cuanto mide la base del rectangulo");
        int base = sc.nextInt();
        
        System.out.println("Cuanto mide la altura del rectangulo");
        int altura  = sc.nextInt();
        
        int area = base * altura;
        int perimetro = base * 2+ altura * 2;
        
        System.out.println("El area del rectangulo es: "+area+ "\n" + "y su perimetro es:" +perimetro);
    }
}