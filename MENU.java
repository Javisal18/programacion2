import java.util.ArrayList;
import java.util.Scanner;
//author javier salcedo//
public class MENU {
    static ArrayList<String> personas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        while (true) {
            System.out.println("MENU PRINCIPAL:");
            System.out.println("1. CREAR PERSONAS.");
            System.out.println("2. ELIMINAR PERSONA.");
            System.out.println("3. LISTA DE PERSONA.");
            System.out.println("4. BUSCAR PERSONA.");
            System.out.println("5. SALIR");

            System.out.println("DIGITA UNA OPCION:");
            int opcion = lectura.nextInt();
            lectura.nextLine(); 
               // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    crearPersona(lectura);
                    break;
                case 2:
                    eliminarPersona(lectura);
                    break;
                case 3:
                    listarPersonas();
                    break;
                case 4:
                    buscarPersona(lectura);
                    break;
                case 5:
                    System.out.println("SALIR");
                    return;
                default:
                    System.out.println("HAS DIGITADO UNA OPCION INVALIDA");
            }
        }
    }

    static void crearPersona(Scanner lectura) {
        System.out.println("INGRESA EL NOMBRE DE LA PERSONA:");
        String nombre = lectura.nextLine();
        personas.add(nombre);
        System.out.println("PERSONA CREADA CON ÉXITO");
    }

    static void eliminarPersona(Scanner lectura) {
        if (personas.isEmpty()) {
            System.out.println("NO HAY PERSONAS EN LA LISTA");
        } else {
            System.out.println("LISTA DE PERSONAS:");
            for (int i = 0; i < personas.size(); i++) {
                System.out.println((i + 1) + ". " + personas.get(i));
            }
            System.out.println("INGRESA EL ÍNDICE DE LA PERSONA A ELIMINAR:");
            int indice = lectura.nextInt() - 1;
            if (0 <= indice && indice < personas.size()) {
                personas.remove(indice);
                System.out.println("PERSONA ELIMINADA CON ÉXITO");
            } else {
                System.out.println("ÍNDICE NO VÁLIDO");
            }
        }
    }

    static void listarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("NO HAY PERSONAS EN LA LISTA");
        } else {
            System.out.println("LISTA DE PERSONAS:");
            for (String persona : personas) {
                System.out.println(persona);
            }
        }
    }

    static void buscarPersona(Scanner lectura) {
        if (personas.isEmpty()) {
            System.out.println("NO HAY PERSONAS EN LA LISTA");
        } else {
            System.out.println("INGRESA EL NOMBRE DE LA PERSONA A BUSCAR:");
            String nombreBuscar = lectura.nextLine();
            if (personas.contains(nombreBuscar)) {
                System.out.println("PERSONA ENCONTRADA");
            } else {
                System.out.println("PERSONA NO ENCONTRADA");
            }
        }
    }
}