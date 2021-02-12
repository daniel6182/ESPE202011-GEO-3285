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
  int opcion=0;
  do{
  System.out.println();
  System.out.println();
  System.out.println(" ======== OPTION MENU ========= ");
  System.out.println(" _____________ ");
  System.out.println(" _____________ ");
  System.out.println(" ======== 1. Calculator for the area of ​​the Pentagon ========= ");
  System.out.println(" ======== 2. Calculator for the area of ​​the Rhomboid========= ");
  System.out.println(" ======== 3. Calculator for the area of ​​the Trapezoid========= ");
  System.out.println(" _____________ ");
  System.out.println(" _____________ ");
  System.out.println(" Enter an option ");
  opcion = input.nextInt();
  switch (opcion){
  
   
      
        case 1:
         System.out.println("===Enter the perimeter===");
         int perimetro = input.nextInt();
         System.out.println("===Enter the Apothem===");
         int apotema= input.nextInt();
         System.out.println("===THE PENTAGON AREA IS=== :"+areapentagono(perimetro,apotema));
        break;
        case 2:
         System.out.println("Ingrese la base");
         int base_r =input.nextInt();
         System.out.println("Ingrese la Altura");
         int altura_r =input.nextInt();
         System.out.println(" EL AREA DEL ROMBOIDE ES :"+arearomboide(base_r,altura_r));
        break;
        case 3:
         System.out.println("INGRESE LA BASE MAYOR");
         int base_ma=input.nextInt();
         System.out.println("INGRESE LA BASE MENOR");
         int base_me=input.nextInt();
         System.out.println("INGRESE LA ALTURA");
         int altura_t=input.nextInt();
         System.out.println(" EL AREA DEL TRAPECIO ES :"+areatrapecio(base_ma,base_me,altura_t));
        break;

  }
 
  }while(opcion!=3);
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
    

