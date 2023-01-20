import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ArbolBinario aBinario = new ArbolBinario();
        NodoArbol nodoArbolCopia = null;
        int opcionMenu;
        String nombre, correo, cedula;
        Scanner sqScanner = new Scanner(System.in);



        do {
            limpiarPantall();
            System.out.println();
            System.out.print("Menu Principal"
                    + "\n1 -> Agregar Persona al Arbol"
                    + "\n2 -> Recorrido del arbol con inOrden"
                    + "\n3 -> Copiar un Arbol"
                    + "\n4 -> Salir"
                    + "\nIngrese la opcion: ");
            opcionMenu = sqScanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    limpiarPantall();
                    System.out.print("Ingresa el nombre de la persona a ingresar al arbol -> ");
                    nombre = sqScanner.next();
                    System.out.print("Ingresa la cedula de la persona a ingresar al arbol -> ");
                    cedula = sqScanner.next();
                    System.out.print("Ingresa el correo de la persona a ingresar al arbol -> ");
                    correo = sqScanner.next();
                    aBinario.agregarDato(new Persona(cedula, nombre, correo));
                    System.out.println();
                    break;
                case 2:
                    limpiarPantall();
                    int opcionArbol;

                    do {
                        System.out.println();
                        System.out.print("Menu Imprimir Arbol"
                                + "\n1 -> Recorrido del arbol con inOrden"
                                + "\n2 -> Recorrido del arbolCopia con inOrden"
                                + "\n3 -> Menu Principal"
                                + "\nIngrese la opcion: ");
                        opcionArbol = sqScanner.nextInt();
                        switch (opcionArbol) {
                            case 1:
                                limpiarPantall();
                                if (aBinario.raiz == null) {
                                    System.out.println("Arbol Actualmente Vacion");
                                } else {
                                    aBinario.mostrarInOrden(aBinario.raiz);
                                }
                                break;
                            case 2:
                                limpiarPantall();
                                if (nodoArbolCopia == null) {
                                    System.out.println("Arbol Actualmente Vacion");
                                } else {
                                    aBinario.mostrarInOrden(nodoArbolCopia);
                                }

                                break;
                            case 3:
                                limpiarPantall();
                                System.out.println("Llendo al menu principal ->");
                                break;
                            default:
                                System.out.println("Opcion Invalida!!!");
                        }
                    } while (opcionArbol != 3);
                    break;
                case 3:
                    limpiarPantall();
                    nodoArbolCopia = aBinario.cloneArbol(aBinario.raiz);
                    System.out.println("Arbol Clonado con Exito!!!");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Finalizando Programa!!!");
                    break;
                default:
                    System.out.println("Opcion Invalida!!!");
            }

        } while (opcionMenu != 4);
        sqScanner.close();
    }

    public static void limpiarPantall() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
