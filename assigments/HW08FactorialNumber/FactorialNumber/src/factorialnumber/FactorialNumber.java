/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialnumber;

import java.util.Scanner;

/**
 *
 * @author Thomas Chavez
 */
public class FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input=new Scanner (System.in);
       boolean mainloop = true;
       int option;
        
       do{
           System.out.println("==== FACTORIAL======");
           System.out.println("1. -> Factorial");
           System.out.println("0. -> Exit");
           
           System.out.println("Enter your menu option ->");
           option = input.nextInt();
           
           switch(option){
               
            case 1:
               int factorial = 1;
               int number = 0;
               int stop = 15;
               
               System.out.println("The factorial number of --> ");
               number = input.nextInt();
               
               factorial = 1;
               while(number !=0)
               {
                factorial *=number;
                number --;
               }
               System.out.println("The factorial number is \n"+ factorial );
                    
                break;
                
            case 0:
                System.out.println("Good Bye my friend");
                System.exit(0);
                break;
                
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 0);
    }
}
