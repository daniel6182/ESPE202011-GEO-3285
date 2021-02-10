/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12libraries;

/**
 *
 * @author Thomas Chavez
 */
public class WS12Libraries {

    private static int base;

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {

        //Math library
        //if we don"t have the libary ?
        float squareRoot = 0.0F;
        float number = 0.0F;
        float power = 0.0F;
        float exponent = 0.0F;

        number = 9; //squareRoot = ? -  3 
        squareRoot = (float) Math.sqrt(number);
        System.out.println("The square root of ->" + number + "<- is ->" + squareRoot);

        number = 49; //? 7
        squareRoot = (float) Math.sqrt(number);
        System.out.println("The square root of ->" + number + "<- is ->" + squareRoot);

        number = 5; //? 2.23
        squareRoot = (float) Math.sqrt(number);
        System.out.println("The square root of ->" + number + "<-");
        base = 3;
        exponent = 2;
        //power = 9 ?

        base = 2;
        exponent = 4;
        //power = 16?

        base = 78;
        exponent = 5;
        //calculator 78*5 
        //2.887.174.368
        
    }

    public static float computePower(float base, float exponent) {
        float power;
        power = 1.0F;

        for (int i = 1; i <= (int) exponent; i++) {
            power = power * base;
        }
        return power;
    }

    private static float getAbsoluteValue(float number) {
        if (number < 0) {
           return -number;
        } else{ 
           return number;
    }  
     }
}

