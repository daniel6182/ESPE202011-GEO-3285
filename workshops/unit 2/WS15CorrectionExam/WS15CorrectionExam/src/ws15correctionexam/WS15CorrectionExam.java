/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws15correctionexam;

import java.util.Scanner;

/**
 *
 * @author Thomas Chavez
 */
public class WS15CorrectionExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int totalOfAnimals =0;
String[] Animals;
float [] weightAnimals;

Scanner scanner = new Scanner(System.in);

System.out.println("The weight of the animal->");
totalOfAnimals = scanner.nextInt();
 Animals = new String[totalOfAnimals];
 weightAnimals = new float[totalOfAnimals];
 
for (int i = 0; i < totalOfAnimals; i++){
     scanner.nextLine();
     System.out.println("Enter the name of animal" + i + "->");
     Animals[i]=scanner.nextLine();
     System.out.println("Enter animal" + i + "weight");
     weightAnimals[i] = scanner.nextFloat();
     
}
       System.out.println("Animal   ->  t weightAnimals ");

for (int i = 0; i < totalOfAnimals; i++){
    System.out.print(Animals[i]+ "-> t"+ weightAnimals[i] );
    
}
}
        
}
