// Esta es la clase auxiliar nodo
// Note que puede redefinir el nodo como generico, o cambiar el tipo de la estructura de datos a almacenar
  
public class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

}
