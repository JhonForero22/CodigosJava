/*
 Ultima vez modificado 10/14/2022
*/
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Atributos
        int opcionMenu;
        // Se crea un nuevo objeto Cola llamado colaNueva
        Cola colaNueva = new Cola();
        // Conexion de escaner
        Scanner eScanner = new Scanner(System.in);
        limpiarPantall();
        do {
            // Menu
            System.out.println("Menu Estructura Cola: ");
            System.out.println("1 -> Insertar un elemento en la cola.");
            System.out.println("2 -> Quitar un elemento de la cola");
            System.out.println("3 -> La cola esta vacia?");
            System.out.println("4 -> Elemento ubicado al inicio de la lista");
            System.out.println("5 -> Tamaño de la cola");
            System.out.println("6 -> Imprimir datos de cola");
            System.out.println("7 -> Salir del programa");
            System.out.print("Ingrese la opcion escoguida: ");
            opcionMenu = eScanner.nextInt();
            limpiarPantall();
            switch (opcionMenu) {
                case 1:
                    String nombre, correo;
                    int cedula;
                    // Se solicita el dato
                    System.out.println("Ingresar el elemento a añadir en la Cola: ");
                    System.out.print("Ingrese el nombre: ");
                    nombre = eScanner.next();
                    System.out.print("Ingrese la cedula de " + nombre + ": ");
                    cedula = eScanner.nextInt();
                    System.out.print("Ingrese el correo de " + nombre + ": ");
                    correo = eScanner.next();
                    colaNueva.insertar(new Persona(cedula, nombre, correo));
                    break;
                case 2:
                    // Si la lista colaNueva es igual a false
                    if (colaNueva.estaVacia() == false) {
                        // Se procede a guardar el dato de colaNueva;
                        Persona datoEliminado = colaNueva.quitar();
                        // Se imprime el mensaje
                        System.out.println(
                                "Elemento eliminado " + datoEliminado + ", en la posicion "
                                        + (colaNueva.tamañoNodoCola + 1));
                        // Por ultimo se procede a quitar el dato de la Cola
                        colaNueva.quitar();
                        // Si no
                    } else {
                        // Se imnprime el mensaje
                        System.out.println("La Cola esta vacia!!!");
                    }
                    break;

                case 3:
                    // Si la lista colaNueva es igual a false
                    if (colaNueva.estaVacia() == false) {
                        // Se imnprime el mensaje
                        System.out.println("La cola NO esta vacia(Tiene datos)");
                        // Si no
                    } else {
                        // Se imnprime el mensaje
                        System.out.println("La Cola esta vacia!!!");
                    }
                    break;

                case 4:
                    // Si la lista colaNueva es igual a false
                    if (colaNueva.estaVacia() == false) {
                        // Se imnprime el mensaje del inicio de la cola
                        System.out.println("El elemento ubicado al inicio de la Cola es " + colaNueva.inicioCola());
                        // Si no
                    } else {
                        // Se imnprime el mensaje
                        System.out.println("La Cola esta vacia!!!");
                    }
                    break;

                case 5:
                    // Si la lista colaNueva es igual a false
                    if (colaNueva.estaVacia() == false) {
                        //Imprime el tamaño de la lista del nodo
                        System.out.println("El tamaño de la lista de la cola es " + colaNueva.tamañoCola());
                        // Si no
                    } else {
                        //Imprimir mensaje
                        System.out.println("La Cola esta vacia!!!");
                    }
                    break;

                case 6:
                    // Metodo para imprimir los datos que haya metido funcione
                    colaNueva.imprimirCola();

                    break;

                case 7:
                    System.out.println("Finalizando programa!!!");
                    break;
                default:
                    System.out.println("Opcion Invalida!!!");
                    break;
            }
        } while (opcionMenu != 7);
        eScanner.close();
    }
    public static void limpiarPantall() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
