/*
 Ultima vez modificado 10/12/2022
*/
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Atributos 
        int opcionMenu, elementoIngresar;
        //Creacion de la nueva pilaNueva de la clase Pila
        Pila pilaNueva = new Pila();

        //Escaner para recibir datos
        Scanner eScanner = new Scanner(System.in);
        do {
            //Menu 
            System.out.println("Menu Estructura Cola: ");
            System.out.println("1 -> Insertar un elemento en la Pila.");
            System.out.println("2 -> Quitar un elemento de la Pila");
            System.out.println("3 -> La Pila esta vacia?");
            System.out.println("4 -> Elemento ubicado al inicio de la lista");
            System.out.println("5 -> Tamaño de la Pila");
            System.out.println("6 -> Vaciar datos de Pila");
            System.out.println("7 -> Salir del programa");
            System.out.print("Ingrese la opcion escoguida: ");
            opcionMenu = eScanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    //Mensaje
                    System.out.println("Ingresar el elemento a añadir en la Pila: ");
                    elementoIngresar = eScanner.nextInt();
                    //Se agrega el dato a la Pila
                    pilaNueva.push(elementoIngresar);
                    break;
                case 2:
                    // Si el resultado del metodo pilaVacia es igual a false
                    if (pilaNueva.pilaVacia() == false) {
                        //Se imprime el mensaje con el elementos retirado 
                        System.out.println("El elemento retirado de la Píla es " + pilaNueva.pop());
                        //Si no
                    } else {
                        //Se imprime el mensaje
                        System.out.println("La Cola esta vacia!!!");
                    }
                    break;
                case 3:
                    // Si el resultado del metodo pilaVacia es igual a false
                    if (pilaNueva.pilaVacia() == false) {
                        //Se imprime el mensaje
                        System.out.println("La PILA NO esta vacia(Tiene datos)");
                        //Si no
                    } else {
                        //Se imprime el mensaje
                        System.out.println("La PILA esta vacia!!!");
                    }
                    break;

                case 4:
                    // Si el retorno del metodo de la pilaVacia es igual a false
                    if (pilaNueva.pilaVacia() == false) {
                        //Se retorna el elementos de la cima de la Pila
                        System.out.println("El elemento al inicio de la Pila es " + pilaNueva.cima());
                        //Si no
                    } else {
                        //Se imprime el mensaje
                        System.out.println("La PILA esta vacia!!!");
                    }
                    break;
                case 5:
                    // Imprimir el tamño de la Pila
                    System.out.println("El tamaño de la Pila es igual a " + pilaNueva.tamaño);
                    break;
                case 6:
                    //Limpiar pila totalmente
                    pilaNueva.limpiarPila();
                    System.out.println("La pila se ah vaciado!!!");
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

}
