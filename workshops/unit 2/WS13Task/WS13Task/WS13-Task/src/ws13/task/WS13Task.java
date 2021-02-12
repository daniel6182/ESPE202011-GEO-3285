/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

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
    Scanner Entrada = new Scanner(System.in);
float  v,t,h ;
double total;
int op;
do{
System.out.println("BIENVENIDO A CAIDA LIBRE"
);
System.out.println("1.Calcular Velocidad");
System.out.println("2.Calcular Altura");
System.out.println("3.Calcular Tiempo");

System.out.println("4.Salir");

System.out.println("Introduce Opcion ");
op=Entrada.nextInt();  

switch(op) {
case 1: 
System.out.println("Calcular Velocidad");
System.out.println("Ingresa Altura: ");
h=Entrada.nextFloat();

total=Math.sqrt(2*9.8*h);
System.out.println("La Velocidad es:"+total+"M/s");
System.out.println();
break;
case 2: 
System.out.println("Calcular Altura");
System.out.println("Ingresa Tiempo: ");
t=Entrada.nextFloat();

total=(9.8*(t*t))/2;
System.out.println("La Altura es:"+total+"Ms");
System.out.println();
break;

case 3: 
System.out.println("Calcular Tiempo");
System.out.println("Ingresa Tiempo: ");
h=Entrada.nextFloat();

total=(Math.sqrt((2*h)/9.8));
System.out.println("El Tiempo es:"+total+"s");
System.out.println();
break;



default: 

System.out.println("GOOD BYE");
System.out.println();
}
}while (op!=4);
}
public static int CaidaLibre(int caidaLibre ) {
CaidaLibre  i= new CaidaLibre ();
i.menu();
            return 0;
}
}
        
