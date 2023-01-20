/*
 Ultima vez modificado 10/12/2022
*/
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Pila pilaNueva = new Pila();
        Scanner eScanner = new Scanner(System.in);
        int opcionMenu;

        do {
            System.out.println("Menu de la Pila:");
            System.out.println("1 -> Ingresar elementos en la lista (push)");
            System.out.println("2 -> Eliminar elementos (pop)");
            System.out.println("3 -> Mostrart lista completa");
            System.out.println("4 -> Salir");
            System.out.print("Ingrese la opcion: ");
            opcionMenu = eScanner.nextInt();
            switch (opcionMenu) {
                case 1:
                    pilaNueva.push();
                    break;
                case 2:
                    pilaNueva.pop();
                    break;
                case 3:
                    pilaNueva.mostrarPila();
                    break;
                case 4:
                    System.out.println("Finalizando programa!!!");
                    break;
                default:
                    System.out.println("Opcion invalida!!!");
                    break;
            }
        } while (opcionMenu != 4);
        eScanner.close();
    }

}
