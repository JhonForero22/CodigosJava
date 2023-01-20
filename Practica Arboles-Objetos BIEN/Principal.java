import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ArbolBinario aBinario = new ArbolBinario();
        int edad, opcionMenu;
        String nombre;
        Scanner sqScanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.print("Menu Principal"
                    + "\n1 -> El arbol esta vacio? "
                    + "\n2 -> Agregar Persona al Arbol"
                    + "\n3 -> Cantidad de personas almacenadas en el Arbol"
                    + "\n4 -> Buscar persona en el Arbol"
                    + "\n5 -> Eliminar persona en el Arbol"
                    + "\n6 -> Recorrido del arbol con preOrden"
                    + "\n7 -> Recorrido del arbol con postOrden"
                    + "\n8 -> Recorrido del arbol con inOrden"
                    + "\n9 -> Recorrido por Nivel"
                    + "\n10 -> Salir"
                    + "\nIngrese la opcion: ");
            opcionMenu = sqScanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    limpiarPantall();
                    System.out.println("El arbol esta vacio: " + (aBinario.isEmpty() ? "Verdadero" : "Falso"));
                    System.out.println();
                    break;
                case 2:
                    limpiarPantall();
                    System.out.print("Ingresa el nombre de la persona a ingresar al arbol -> ");
                    nombre = sqScanner.next();
                    System.out.print("Ingresa la edad de la persona a ingresar al arbol -> ");
                    edad = sqScanner.nextInt();
                    aBinario.agregarDato(new Persona(edad, nombre));
                    System.out.println();
                    break;
                case 3:
                    limpiarPantall();
                    System.out.println("Cantidad de Personas dentro del arbol -> " + aBinario.getSize());
                    System.out.println();
                    break;
                case 4:
                    limpiarPantall();
                    System.out.print("Ingresa el nombre de la persona a buscar en el arbol -> ");
                    nombre = sqScanner.next();
                    System.out.println(aBinario.buscarValor(nombre) ? "SI esta " + nombre : "NO esta " + nombre);
                    System.out.println();
                    break;
                case 5:
                    limpiarPantall();
                    System.out.print("Ingresa el nombre de la persona a eliminar en el arbol -> ");
                    nombre = sqScanner.next();
                    if (aBinario.buscarValor(nombre) == true) {
                        aBinario.eliminar(nombre);
                        System.out.println("Usuario " + nombre + ", eliminado del Nodo!!!");
                    } else {
                        System.out.println("Usuario NO encontrado o mal escrito!!!");
                    }
                    System.out.println();
                    break;
                case 6:
                    limpiarPantall();
                    System.out.println("Recorrido con preOrden");
                    aBinario.mostrarPreOrder(aBinario.raiz);
                    System.out.println();
                    break;
                case 7:
                    limpiarPantall();
                    System.out.println("Recorrido con postOrden");
                    aBinario.mostrarPostOrder(aBinario.raiz);
                    System.out.println();
                    break;
                case 8:
                    limpiarPantall();
                    System.out.println("Recorrido con inOrden");
                    aBinario.mostrarInOrden(aBinario.raiz);
                    System.out.println();
                    break;
                case 9:
                    limpiarPantall();
                    System.out.println("Recorrido por Nivel");
                    aBinario.mostrarPorNivel();
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Finalizando Programa!!!");
                    break;
                default:
                    System.out.println("Opcion Invalida!!!");
            }
        } while (opcionMenu != 10);

        sqScanner.close();
        /*
         * ArbolBinario aP = new ArbolBinario();
         * System.out.println("El arbol esta vacio: " + (aP.isEmpty() ? "Verdadero" :
         * "Falso"));
         * aP.agregarDato(new Persona(15, "Prueba1"));
         * aP.agregarDato(new Persona(13, "Prueba2"));
         * aP.agregarDato(new Persona(18, "Prueba4"));
         * aP.agregarDato(new Persona(44, "Prueba3"));
         * System.out.println("El arbol esta vacio: " + (aP.isEmpty() ? "Verdadero" :
         * "Falso"));
         * 
         * System.out.println("\nRecorrido preOrden");
         * aP.mostrarPreOrder(aP.raiz);
         * System.out.println("\nRecorrido postOrden");
         * aP.mostrarPostOrder(aP.raiz);
         * System.out.println("\nRecorrido inOrden");
         * aP.mostrarInOrden(aP.raiz);
         * System.out.println();
         * System.out.println();
         * 
         * System.out.println("Cantidad de nodos dentro del arbol -> " + aP.getSize());
         * 
         * System.out.println();
         * System.out.println(aP.buscarValor("Prueba1") ? "Si esta Prueba1" :
         * "No esta Prueba1");
         * System.out.println(aP.buscarValor("Prueba2") ? "Si esta Prueba2" :
         * "No esta Prueba2");
         * System.out.println(aP.buscarValor("Prueba3") ? "Si esta Prueba3" :
         * "No esta Prueba3");
         * System.out.println(aP.buscarValor("Prueba4") ? "Si esta Prueba4" :
         * "No esta Prueba4");
         * System.out.println(aP.buscarValor("Prueba5") ? "Si esta Prueba15" :
         * "No esta Prueba5");
         * System.out.println();
         * aP.agregarDato(new Persona(1, "Prueba5"));
         * System.out.println(aP.buscarValor("Prueba5") ? "Si esta Prueba5" :
         * "No esta Prueba5");
         * System.out.println();
         * 
         * System.out.println("Cantidad de nodos dentro del arbol -> " + aP.getSize());
         * System.out.println();
         * 
         * aP.eliminar("Prueba1");
         * System.out.println(aP.buscarValor("Prueba1") ? "Si esta Prueba1" :
         * "No esta Prueba1");
         */
    }

    public static void limpiarPantall() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
