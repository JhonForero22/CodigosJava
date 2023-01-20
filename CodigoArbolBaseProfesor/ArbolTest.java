
public class ArbolTest {
public static void main(String[] args) {
    BinaryTree bt;

    bt = new BinaryTree();

    // El arbol esta vacio
    System.out.println(bt.isEmpty()? "Arbol vacio." : "Arbol no vacio.");
    System.out.println("Hay " + bt.getSize() + " elementos.");
 
    // Se anaden algunos valores
    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);

    // El arbol ya no esta vacio
    System.out.println(bt.isEmpty()? "Arbol vacio." : "Arbol no vacio.");
    System.out.println("Hay " + bt.getSize() + " elementos.");

    // Buscamos algunos valores
    System.out.println(bt.containsNode(6) ? "Si est� el 6." : "No est� el 6.");
    System.out.println(bt.containsNode(4) ? "Si est� el 4." : "No est� el 4.");
    System.out.println(bt.containsNode(1) ? "Si est� el 1." : "No est� el 1.");

    // Borramos y verificamos
    System.out.println(bt.containsNode(9) ? "Si est� el 9." : "No est� el 9.");
    bt.delete(9);
    System.out.println(bt.containsNode(9) ? "Si est� el 9." : "No est� el 9.");

    // Hacemos los recorridos
    System.out.println("\nRecorrido preOrden");
    bt.traversePreOrder(bt.root);

    System.out.println("\nRecorrido postOrden");
    bt.traversePostOrder(bt.root);

    System.out.println("\nRecorrido inOrden");
    bt.traverseInOrder(bt.root);

    System.out.println("\nRecorrido por nivel");
    bt.traverseLevelOrder();

    System.out.println("\n�Siga jugando con los arboles!");
}
}

