/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acostadomenicaexam2;

import java.util.Scanner;

/**
 *
 * @author Thomas Chavez
 */
public class AcostaDomenicaExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] add = new int[5];
        System.out.println("---------ADD THE NUMERS---------");
        for (int i = 0; i < 5; i++) {
            System.out.print("please enter the number you want to sum " + (i + 1) + " -> ");
            add[i] = input.nextInt();
            sum = calculateSum(sum, add, i);

        }
        System.out.println("The total sum is equal to " + sum);
        System.out.println("");

        //PART2
        float prom = 0;
        float[] average = new float[3];
        float addition = 0;
        System.out.println("---------CALCULATE AVERAGE---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("please enter the number you want to calculate the average " + (i + 1) + " -> ");
            average[i] = input.nextInt();
            prom = calculateAverage(addition, average, i);

        }
        System.out.println("The average is equal to " + prom);
        System.out.println("");

        //PART3 
        int[] number = {12, 23, 34, 98, 87, 65, 0};
        int numb;

        System.out.println("--------SEARCH THE NUMBERS---------");
        for (int i = 0; i < 7; i++) {
            System.out.print("please enter the number you want to search" + (i + 1) + " ->  ");
            numb = input.nextInt();
            if (numb == number[i]) {
                System.out.println("The number " + numb + " is in the array");
            } else {
                System.out.println("The number " + numb + " isn't in the array");
            }

        }

    }

    private static float calculateAverage(float addition, float[] average, int i) {

        addition = (addition + average[i]);
        float prom = addition / 3;
        return prom;
    }

    private static int calculateSum(int sum, int[] add, int i) {
        sum = sum + add[i];
        return sum;
    }

}

    
 
