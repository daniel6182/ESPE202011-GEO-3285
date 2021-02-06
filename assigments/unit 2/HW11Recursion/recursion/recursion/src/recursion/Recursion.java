/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author Thomas Chavez
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static int Mult(int a, int b){
      if (a== 0 ||b==0) {
         return 0;
         
      }else{
          return a+Mult(a,(b-1));
      }
    }
    
    public static void main(String[] args) {
        int a,b;
        Scanner input =new Scanner (System.in);
        System.out.println("Enter de number 1");
        a=input.nextInt();
        System.out.println("Enter de number 2");
        b=input.nextInt();
        
        while (b< 0 || a<0){
            System.out.println("The numbers is possitive");
            System.out.println("Enter de number 1");
            a=input.nextInt();
            System.out.println("Enter de number 2");
            b=input.nextInt();
        }
        System.out.println("The multiplication " + a +" * " + b + " is =" + Mult(a,b));
    }
}

