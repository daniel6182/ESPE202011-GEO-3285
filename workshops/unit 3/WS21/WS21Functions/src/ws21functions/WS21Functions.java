/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21functions;

import java.util.Scanner;

/**
 *
 * @author Thomas Chavez
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
    
int day1 = 0;
int day2 = 0;
int result;
int kilometers= 12;
int fuel=0;
int kilometerstraveled;
int spentfuel;


System.out.println("Author Kevin Daniel Yaguana Yaguana");
        ConsumedofGasolineforTwoDays(scanner);

System.out.println("Calculator to know the fuel used in km :");  
System.out.println("Enter the kilometers:");      
kilometerstraveled = scanner.nextInt();

spentfuel=(kilometerstraveled*fuel)/kilometers;
System.out.println("Total fuel->"+ spentfuel);   
    }

    private static void ConsumedofGasolineforTwoDays(Scanner scanner) {
        int day1;
        int day2;
        int result;
        System.out.println("Calculator to add the total gasoline consumed in two days ");
        System.out.println("Enter the value on the first day :");
        day1 = scanner.nextInt();
        System.out.println("Enter the value on the second day:");
        day2 = scanner.nextInt();
        result = day1+day2;
        System.out.println("The total sum of gasoline consumed in two days is " + day1 + " + " + day2 + " = " + result);
    }
    
}
