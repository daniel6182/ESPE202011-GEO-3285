/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaguana.kevinq11;

import java.util.Scanner;

/**
 *
 * @author Thomas Chavez
 */
public class YaguanaKevinQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner (System.in);
    boolean mainLoop = true; 
    int option;
    do{
     System.out.println("Enter the table that you want to study 1. \n or (0) "
             + "for Exit --> ");
        option = input.nextInt();
        
        switch(option){            

        
        case 1:
            System.out.println("Enter a table");
             final int top = 12;
        int product;
        int table;
        table = input.nextInt();
        System.out.println("Multiplication tables: " + table);
       for(int n = 1; n <= top; n++){
            product = table * n;
            System.out.println( table + " * " + n + " = " + product);
            product++;
       }
              break;
                 case 0:
            System.out.println("-> Good Bye <-");
                    System.exit(0);
                    break;
        }
        
    }while (option != 0);
     }  
    } 



    

