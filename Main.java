/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

/**
 *
 * @author javier salcedo
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese email: ");
        String email = scanner.next();
        System.out.print("Ingrese salario: ");
        double salario = scanner.nextDouble();
        System.out.print("Ingrese jefe inmediato: ");
        String jefeInmediato = scanner.next();
        System.out.print("Ingrese años de experiencia: ");
        int anosExperiencia = scanner.nextInt();

        Empleado empleado = new Empleado(nombre, apellido, direccion, telefono, edad, email, salario, jefeInmediato, anosExperiencia);
System.out.println("\nDatos del empleado:");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Dirección: " + empleado.getDireccion());
        System.out.println("Teléfono: " + empleado.getTelefono());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Email: " + empleado.getEmail());
        System.out.println("Salario: $" + empleado.getSalario());
        System.out.println("Jefe inmediato: " + empleado.getJefeInmediato());
        System.out.println("Años de experiencia: " + empleado.getAnosExperiencia());
        System.out.println("Cargo: " + empleado.getNombreCargo());
    }
}
        
    
                

       
