/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.seleccion;

import java.util.Scanner;

/**
 *
 * @author imad
 */
public class Ej7 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion;

        //Declaracion variables
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado calcular el área de un cuadrado...");
                break;
            case 2:
                System.out.println("Ha seleccionado calcular el 	área de un triángulo...");
                break;
            case 3:
                System.out.println("Ha seleccionado calcular el área de un círculo...");
                break;
            default:
                System.out.println("Ha seleccionado terminar");
                break;
        }
    }
}
