/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menu;

import java.util.Scanner;

/**
 *
 * 
 */
public class HW04Menu {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Calcular el area del rectangulo");
            System.out.println("2. -> Multiplication Tables : 15");
            System.out.println("3. -> 2 raised to power");
            System.out.println("4. -> This is a while loop from 1 to 10 ");
            System.out.println("5. -> Exit"); 

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                   Scanner sc = new Scanner (System.in);
                   System.out.println("Calcular el area del rectangulo");
        
                   System.out.println("Cuanto mide la base del rectangulo");
                   int base = sc.nextInt();
        
                   System.out.println("Cuanto mide la altura del rectangulo");
                   int altura  = sc.nextInt();
        
                   int area = base * altura;
                   int perimetro = base * 2+ altura * 2;
        
                 System.out.println("El area del rectangulo es: "+area+ "\n" + "y su perimetro es:" +perimetro);
                   break;
                case 2:
                    System.out.println("Multiplication Tables : 15");
                       int top=12;
                       int product=0;
                       int table = 15;
                    for (int j = 1 ; j <= top ; j++)
                    product = table * j;
                {
                    String j = null;
                    System.out.println("15 * " + j + " = " + product);
                }
                    break;

                case 3: 
                Scanner pot = new Scanner (System.in);
                  int x,n=2;
        
                 for(x=1;x<=12;x++);
        
                 int resultado=(int)Math.pow (n,x);
            
                 System.out.println("El resultado es:" +resultado);
                    
        
                    break;
                    case 4:
                        int i;
                        i = 0;

                    System.out.println("==== This is a while loop from 1 to 10 ====");

                   while (i < 10) 
                   System.out.println("i -> " + (i + 1));
                    i++;
         
                    break;
                case 5:
                    System.out.println("See you tomorrow my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}
