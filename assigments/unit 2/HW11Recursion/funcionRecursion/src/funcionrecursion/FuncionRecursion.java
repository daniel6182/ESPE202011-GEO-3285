/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionrecursion;

/**
 *
 * @author Thomas Chavez
 */
public class FuncionRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int base = 20;
        int exponente = 6;
 
        System.out.println(potencia(base, exponente));
 
    }
 
    public static double potencia(int base, int exponente) {
 
        if (exponente == 0) { //caso base
            return 1; //10^0 = 1
        } else if (exponente == 1) { //caso base
            return base; //10^1 = 10
        } else if (exponente < 0) { //Exponente negativo
            return potencia(base, exponente + 1) / base;
        } else {  //Exponente positivo
            return base * potencia(base, exponente - 1);
        }
    }
}

   