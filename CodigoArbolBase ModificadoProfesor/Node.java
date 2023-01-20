// Esta es la clase auxiliar nodo
// Note que puede redefinir el nodo como generico, o cambiar el tipo de la estructura de datos a almacenar

public class Node {
    String value;
    Node left;
    Node right;

    Node(String nombre) {
        this.value = nombre;
        right = null;
        left = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
