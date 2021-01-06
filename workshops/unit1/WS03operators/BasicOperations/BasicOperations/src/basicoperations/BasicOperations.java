/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author Thomas Chavez
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int sum;
  int addend1; 
  int addend2;
  
  int minuend;
  int subtrahend;
  int difference;
      
  int product;
  int multiplicant; 
  int multiplier;
  
  int divisor;
  int dividend = 0;
  int quotient;
  
  int quantity;
  int base;
  int module;
  
  minuend = -23;
  subtrahend = -6;
  difference = -17;
  multiplicant = 13;
  multiplier = 6;
  divisor = 15;
  quantity = 5; 
  base = 8;
  
    //initialization
    addend1 = 5;
    addend2 = 18; 
  
    
    //oparation 
    sum = addend1 + addend2;
    
    System.out.println("the eddition off" + addend1 + " + " + addend2 + 
            " is aqual to --> " + sum);
    
        ++sum;
        System.out.println("sum is equal to --> " + sum);
    
        sum++;
    System.out.println("sum is equal to --> " + sum);
    
    System.out.println("adding one to sum" + (sum++));
    System.out.println("adding one to sum" + ((++sum)));
    
     
    System.out.println("the subtraction of" + minuend + "-" + subtrahend + 
            "is equal to" + (minuend - subtrahend));
    
    difference = minuend - subtrahend; 
    
    System.out.println("diffrence is equal to -->" + difference);
    
    product = multiplicant * multiplier; 
     product =  multiplier * multiplicant; 
     
     System.out.println("the multiplication of" + multiplicant + " * " + multiplier +
                "is equal to --> " + product);
    System.out.println("product is equal to-->" + product);
     
    quotient = divisor / dividend;
    
    System.out.print("the division of" + divisor + " / " + dividend + 
            "is equal to -->" + quotient);
    System.out.println("quotient is equal to -->" + quotient);
     
    System.out.print("the module of" + quantity + " % " + base + 
            "is equal to " + quantity % base);
        
        }

}
    
