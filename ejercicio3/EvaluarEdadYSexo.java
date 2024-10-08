/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SECUENCIAL;
import java.util.Scanner;
/**
 *
 * @author el_ja
 */
public class EvaluarEdadYSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su sexo (Masculino/Femenino): ");
        String sexo = scanner.next();

        evaluarEdadYSexo(nombre, apellido, edad, sexo);
    }

    public static void evaluarEdadYSexo(String nombre, String apellido, int edad, String sexo) {
        if (edad >= 18) {
            System.out.println(nombre + " " + apellido + " es mayor de edad.");
        } else {
            System.out.println(nombre + " " + apellido + " es menor de edad.");
        }

        if (sexo.equalsIgnoreCase("Masculino")) {
            System.out.println(nombre + " " + apellido + " es un Hombre.");
        } else if (sexo.equalsIgnoreCase("Femenino")) {
            System.out.println(nombre + " " + apellido + " es una Mujer.");
        } else {
            System.out.println("Sexo no válido.");
        }
    }
}