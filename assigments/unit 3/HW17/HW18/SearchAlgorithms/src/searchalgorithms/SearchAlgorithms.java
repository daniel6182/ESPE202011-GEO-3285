/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgorithms;

import java.util.Scanner;

/**
 *
 * @author Thomas Chavez
 */
public class SearchAlgorithms {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    
int[] laptopPrice = {150, 160, 200, 280, 300, 960, 430, 120, 220};
        int laptop;
        int search;
        int binarySearch;

        Scanner input = new Scanner(System.in);
        System.out.println(" -----Hellow-----");
        System.out.println(" -----I'm Daniel-----");
        System.out.println(" ");
        System.out.println("--- Linnear Search --- ");
        System.out.println(" ");

        System.out.println(" Enter the laptop Price ");
        laptop = input.nextInt();
        System.out.println("the laptop price " + laptop + " the price of the laptop is in the range: " + search(laptopPrice, laptop));

        System.out.println("--- B I N A R Y  S E A R C H --- ");
        System.out.println(" ");

        System.out.println(" Enter the laptop price ");
        laptop = input.nextInt();
        System.out.println("the laptop price " + laptop + " the price of the laptop is in the range: " + binarySearch(laptopPrice, laptop));
    }

    private static int binarySearch(int[] laptopPrice, int laptop) {
        int n = laptopPrice.length;
        for (int i = 0; i < n; i++) {
            if (laptopPrice[i] == laptop) {
                return i;
            }
        }
        return -1;
    }

    private static String search(int[] laptopPrice, int laptop) {
        return null;

    }
    
}
    
