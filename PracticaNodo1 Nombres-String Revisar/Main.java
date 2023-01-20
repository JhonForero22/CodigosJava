import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        listaNombres nombres = new listaNombres();
        int opcioneMenu;
        Scanner eScanner = new Scanner(System.in);

        do {
            System.out.println("Bienvenido!!!"
                    + "\n Menu"
                    + "\n 1 -> Ingresar Nombres"
                    + "\n 2 -> Listar Nombres"
                    + "\n 3 -> Buscar Nombre"
                    + "\n 4 -> Salir"
                    + "\n Ingrese la opcion: ");

            opcioneMenu = eScanner.nextInt();
            switch (opcioneMenu) {
                case 1:
                    String nombre;
                    System.out.print("Ingrese el nombre: ");
                    nombre = eScanner.next();
                    nombres.insterInicioNodo(nombre);
                    break;

                case 2:
                    nombres.listar();
                    break;

                case 3:
                    break;

                case 4:
                    break;
                default:
                    System.out.println("Opcione ingresada Invalida!!!");
            }

        } while (opcioneMenu != 4);
        eScanner.close();
    }

}
