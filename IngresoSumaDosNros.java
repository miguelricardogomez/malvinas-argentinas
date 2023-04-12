/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresosumadosnros;

import java.util.Scanner;



/**
 *
 * @author Ricardo Gomez
 */
public class IngresoSumaDosNros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int nro1, nro2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer Numero");
        nro1 = leer.nextInt();
        System.out.println("Ingrese el Segundo Numero");
        nro2 = leer.nextInt();
        int suma = nro1 + nro2;
        System.out.println("La suma de ambos es: " + suma);
    }
    
}
