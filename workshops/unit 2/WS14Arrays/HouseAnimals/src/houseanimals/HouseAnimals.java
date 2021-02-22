/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseanimals;

import java.util.Scanner;

/**
 *
 * @author Thomas Chavez
 */
public class HouseAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] weightByCats;
        String[] cats = {"Pelusa", "Anastasia", "Perla"};
        float[] weightsBycats = { 1.2F, 2.4F, 45.2F, 80.1F, 4.3F, 4.5F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of houses -> ");
        n = input.nextInt();

        int[] kittensByHouses = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of kittens of the houses " + (i + 1) + " -> ");
            kittensByHouses[i] = input.nextInt();
        }

        for (int eggs : kittensByHouses) {
            System.out.println("kittens of houses are " + eggs);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("kittens of the houses " + (i + 1) + " -> " + kittensByHouses[i]);
        }

        for (String cats : cats) {
            System.out.println("chicken name -> " + cats);
        }
        
        for (int i = 0; i < weightsByCats.length ; i++) {
             String[] weightsByHouses = null;
            System.out.println("weight of cats " + (i + 1) + " -> " + weightsByHouses[i]);
        } 
    }
    
}
