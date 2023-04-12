//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

package ejercicio2_guia2;

import java.util.Scanner;

public class Ejercicio2_guia2 {

    public static void main(String[] args) {
    String nombre;
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
       nombre = leer.nextLine();
        System.out.println("Hola "+nombre+" bienvenido!");
    }
    
}
