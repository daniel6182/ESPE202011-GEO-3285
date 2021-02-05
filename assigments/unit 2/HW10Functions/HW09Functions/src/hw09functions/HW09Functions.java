/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw09functions;

import java.util.Scanner;

/**
 *
 * @author Thomas Chavez
 */
public class HW09Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
        int divd;
        int divr;
        float quotient = 0;
        int x = 0;
        int y = 0;
        int multiplicand;
        int product;
        int top = 12;
        
        System.out.println("Insert a number for divd -->");
        divd = input.nextInt();
        
        System.out.println("Insert a number for divr -->");
        divr = input.nextInt();
                
        
        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient is -> " + quotient);

        System.out.println("Insert a number for fuction -->");
        x = input.nextInt();
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);
        
        System.out.println("Insert a number for fuction -->");
        x = input.nextInt();
        y = g(x);
        System.out.println("the value of -> " + x + " <- is equal to -> " + y);
        
        System.out.println("insert a positive number");
        multiplicand = input.nextInt();
        for (int multiplier = 1 ; multiplier <= top ; multiplier++){
            product = gettable (multiplicand, multiplier);
            System.out.println(multiplicand  + " x " + multiplier + " = " + product);
        }
}

    
    public static float divideTwoNumbers(int dividend, int divisor) {
        
        float quotient = 0.0F;

       
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }
    
    public static int gettable(int multiplicand, int multiplier){
        int product;
        
        product = multiplicand*multiplier;
        
        return product;
    }

}
