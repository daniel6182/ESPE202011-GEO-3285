/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactor;

import java.util.Scanner;

/**
 *
 * @author Thomas Chavez
 */
public class Refactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
        
       int Exponent;
       int Index ;
       
            System.out.println("<====HELLO====>");
            System.out.println("<=====WELCOME USER====>");
            System.out.println("====MY NAME'S DANIEL====");
            System.out.println("====Enter to Index====");
            Index = input.nextInt();
            System.out.println("====Enter to Exponent====");
            Exponent = input.nextInt();
            int Result = (int) Math.pow(Index, Exponent);

            System.out.println(Index + " Raised to the " + Exponent + 
                    " is equal to " + Result);

            System.out.println("<====BYE PERSON====>");
    }
    }
