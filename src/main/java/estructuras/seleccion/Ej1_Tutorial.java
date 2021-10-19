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
public class Ej1_Tutorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("escanear edad:");

        int edad = scanner.nextInt();

        if (edad == 10) {
            System.out.println("Tiene 10 años");
        } else if (edad == 18) {
            System.out.println(" Es mayor de edad");

        } else if (edad == 67) {
            System.out.println(" Tiene 67 años");
        } else {
            System.out.println(" La edad no esta registrada");
        }

        System.out.print("mostrar la edad: ");
        System.out.println(edad);
    }

}
