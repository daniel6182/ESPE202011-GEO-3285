/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13task;

import java.util.Scanner;

/**
 *
 * @author Thomas Chavez
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

Scanner input = new Scanner(System.in);
         float  a,ts,t,vf,vini,hmax ;
         double ang;
         double total;
         int op;
         int opcion=0;
  do{
  System.out.println(" ======== CALCULATOR========= ");
  System.out.println("1. Calculator for the area of ​​the Pentagon ");
  System.out.println("2. Calculator for the area of ​​the Rhomboid ");
  System.out.println("3. Calculator for the area of ​​the Trapezoid ");
  System.out.println("======WELCOME TO PARABOLIC SHOT ======");
  System.out.println("4.Calculate Maximum Height");
  System.out.println("5.Calculate Maximum Height Time");
  System.out.println("6.Calculate Time in Air");
  System.out.println("7.Maximum range");
  System.out.println("8. -> Exit");
  System.out.println("Enter your menu option --> ");
  opcion = input.nextInt();
  switch (opcion){
  
   
      
        case 1:
                ComputerAreaThePentagon(input);
        break;
        case 2:
                ComputeAreaTheRhomboi(input);
        break;
        case 3:
                ComputeAreaTheTrapezoid(input);
        break;
        
        case 4: 
                CalculationOfTheMaximumArea(input);
          break;
        case 5 :
                MaximumHeightTimeCalculation(input);
        break;
       
         case 6 :
                TimeInAirCalculation(input);
        break;  
          
        case 7:
                CalculationOfMaximumRange(input);
        break;
          
          case 8:
         System.out.println("Good Bye my friend");
         System.exit(0);
          break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;   

  }
 
  }while(opcion!=8);
 }

    private static void CalculationOfMaximumRange(Scanner input) {
        float vini;
        double ang;
        double total;
        System.out.println("Calculate Maximum Reach");
        System.out.println("Enter Initial Speed:");
        vini=input.nextFloat();
        System.out.println("Enter the Angle:");
        ang=input.nextDouble();
        total=((2*Math.pow(vini, 2))(Math.sin(ang))(Math.cos(ang)))/9.8;
        System.out.println("The Maximum Reach is:"+total+"M");
        System.out.println();
    }

    private static void TimeInAirCalculation(Scanner input) {
        float vini;
        double ang;
        double total;
        System.out.println("Calculate Time in Air");
        System.out.println("Enter Initial Speed:");
        vini=input.nextFloat();
        System.out.println("Enter the Angle:");
        ang=input.nextDouble();
        total=(((2*vini)*Math.sin(ang))/9.8);
        System.out.println("Time in the Air:"+total+"S");
        System.out.println();
    }

    private static void MaximumHeightTimeCalculation(Scanner input) {
        float vini;
        double ang;
        double total;
        System.out.println("Calculate Maximum Height Time");
        System.out.println("Enter Initial Speed: ");
        vini=input.nextFloat();
        System.out.println("Enter the Angle:");
        ang=input.nextDouble();
        total=((vini*Math.sin(ang))/9.8);
        System.out.println("The Maximum Height Time is:"+total+"S");
        System.out.println();
    }

    private static void CalculationOfTheMaximumArea(Scanner input) {
        float vini;
        double ang;
        double total;
        System.out.println("Calculate Maximum Height");
        System.out.println("Enter Initial Speed: ");
        vini=input.nextFloat();
        System.out.println("Enter the Angle:");
        ang=input.nextDouble();
        total=(Math.pow((vini*Math.sin(ang)),2))/(2*9.8);
        System.out.println("The Maximum Height is:"+total+"Mts");
        System.out.println();
    }

    private static void ComputeAreaTheTrapezoid(Scanner input) {
        System.out.println("ENTER MAJOR BASE ");
        int base_ma=input.nextInt();
        System.out.println("ENTER DE MINOR BASE");
        int base_me=input.nextInt();
        System.out.println("ENTER HEIGHT");
        int altura_t=input.nextInt();
        System.out.println(" THE AREA OF THE TRAPEZOID IS :"+areatrapecio(base_ma,base_me,altura_t));
    }

    private static void ComputeAreaTheRhomboi(Scanner input) {
        System.out.println("ENTER THE BASE");
        int base_r =input.nextInt();
        System.out.println("ENTER HEIGHT");
        int altura_r =input.nextInt();
        System.out.println(" THE RHOMBOI AREA IS  :"+arearomboide(base_r,altura_r));
    }

    private static void ComputerAreaThePentagon(Scanner input) {
        System.out.println("Enter the perimeter");
        int perimetro = input.nextInt();
        System.out.println("Enter the Apothem");
        int apotema= input.nextInt();
        System.out.println("THE PENTAGON AREA IS :"+areapentagono(perimetro,apotema));
    }

public static int areapentagono(int p, int a){
     return (p*a) / 2;
    }
  public static int arearomboide(int b,int h){
     return b*h ;
    }
  public static int areatrapecio (int B , int b , int h){
  
   return ((B+b)/2)*h;
    }

      }
    

