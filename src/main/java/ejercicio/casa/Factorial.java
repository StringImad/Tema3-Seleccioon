/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.casa;

/**
 *
 * @author imad
 */
public class Factorial {

    public static void main(String[] args) {
        int n = 5; // n se inicializa a 5 para calcular 5!
        int factorial = 1; // factorial se inicializa a 1
        int i = 1; // el valor inicial de i es 1

        for (int j = 0; j < n; j++) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("El factorial de " + n + " es " + factorial);
    }
}
