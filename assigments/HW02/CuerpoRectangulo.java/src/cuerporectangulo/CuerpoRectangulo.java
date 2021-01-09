package cuerporectangulo;

import java.util.*;
public class CuerpoRectangulo {
    
private static Scanner sc= null;

public static void MostrarMenu(){
  Scanner menu= new Scanner(System.in);
  System.out.println("Seleccione una de las opciones a continuacion");
  System.out.println("\n1:Calcular Area y Perimetro de un Rectangulo");
  System.out.println("\n2:Salir del programa");
           
        }

public static void main(String[] args) {
   Rectangulo resultado;
    resultado = new Rectangulo(0,0);
      int numero;
      int a;
      int b;
      sc= new Scanner (System.in);
      boolean inicia =true;
      while(inicia){
       try{ 
         MostrarMenu();
          numero= sc.nextInt();
               
            switch(numero){
                case 1 :
                   System.out.println("Introduzca la base del Rectangulo");
                    b= sc.nextInt();
                    System.out.println("Introduzca la altura del Rectangulo");
                    a= sc.nextInt();
                    System.out.println(resultado.getArea(b, a));
                    System.out.println(resultado.getPerimetro(b, a));
                break;
                
                case 2 :
                    System.out.println("cerrando programa");
                    System.exit(0);
                break;
                
                default:
                   System.out.println("no existe esta opcion");
            }
        }catch(NumberFormatException ex){   
           System.out.println("a ocurrido un error");
           inicia= true;   
        } catch(Exception ex){
            System.out.println("error inesperado");
            inicia= false;
        }
    } System.gc();
    System.runFinalization();
    System.out.println("el programa funciona excelente");
    
}}