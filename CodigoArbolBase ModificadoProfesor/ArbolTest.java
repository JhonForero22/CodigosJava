//import java.util.Scanner;

public class ArbolTest {
    public static void main(String[] args) {
        BinaryTree bt;
        bt = new BinaryTree();
        /* 
        Scanner sqScanner = new Scanner(System.in);
        int menu;
        String nombre;
        */
        
        bt.add("Jhon");
        bt.add("Arley");
        bt.add("Forero");
        bt.add("Velasco");
        System.out.println();
        System.out.println(bt.containsNode("Jhon"));
        System.out.println(bt.containsNode("Forero"));
        System.out.println(bt.containsNode("Arley"));
        System.out.println(bt.containsNode("Velasco"));
        System.out.println();

        System.out.println("\nRecorrido preOrden");
        bt.traversePreOrder(bt.objetoNode);
        System.out.println("\nRecorrido postOrden");
        bt.traversePostOrder(bt.objetoNode);
        System.out.println("\nRecorrido inOrden");
        bt.traverseInOrder(bt.objetoNode);
        System.out.println();

        System.out.println("Borrar y Verificar: ");
        System.out.println();
        // Borramos y verificamos
        System.out.println(bt.containsNode("Jhon") ? "Si est� Jhon." : "No est� Jhon");
        bt.delete("Jhon");
        System.out.println(bt.containsNode("Jhon") ? "Si est� Jhon." : "No est� Jhon.");
        /* 
        do {
            System.out.print("Menu "
                    + "\n1 -> Arbol Vacio?"
                    + "\n2 -> Agregar Dato al arbol"
                    + "\n3 -> Buscar Dato"
                    + "\n4 -> Borrar Dato"
                    + "\n5 -> Recorrido por preOrden"
                    + "\n6 -> Recorrido por postOrden"
                    + "\n7 -> Recorrido por inOrden"
                    + "\n8 -> Recorrido por nivel"
                    + "\n9 -> Salir"
                    + "\nIngrese la opcion a seleccionar: ");
            menu = sqScanner.nextInt();

            switch (menu) {
                
                case 1:
                    limpiarPantall();
                    // bt.isEmpty, en invoca el metodo de la clase bt
                    // ? Donde la opcion sea verdadera
                    // : Donde la ocpion sea falsa
                    System.out.println(bt.isEmpty() ? "Arbol Vacio" : "Arbol No vacio");
                    System.out.println();
                    break;
                case 2:
                    limpiarPantall();
                    System.out.print("Ingresa el nombre a agregar al arbol: ");
                    nombre = sqScanner.next();
                    bt.add(nombre);
                    System.out.println();
                    break;
                    
                case 3:
                    limpiarPantall();
                    System.out.print("Ingresa el nombre a buscar en el arbol: ");
                    nombre = sqScanner.next();
                    System.out.println(bt.containsNode(nombre) ? "Si esta en el arbol el nombre:" + nombre : "No esta en el arbol el nombre:" + nombre);
                    break;
                case 4:
                    limpiarPantall();
                    System.out.println();
                    break;
                case 5:
                    limpiarPantall();
                    System.out.println();
                    break;
                case 6:
                    limpiarPantall();
                    System.out.println();
                    break;
                case 7:
                    limpiarPantall();
                    System.out.println();
                    break;
                case 8:
                    limpiarPantall();
                    System.out.println();
                    break;
                case 9:
                    limpiarPantall();
                    System.out.println("Finalizando Programa!!!");
                    break;
            }
        } while (menu != 9);
        sqScanner.close();
        */
    }

    // Limpiar Pantalla
    public static void limpiarPantall() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
