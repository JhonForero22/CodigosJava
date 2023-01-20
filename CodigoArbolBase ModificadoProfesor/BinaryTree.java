// La clase para el arbol binario
public class BinaryTree {
    Node objetoNode;

    public BinaryTree BinaryTree(){
        objetoNode = null;
        return this;
    }

    // A�adir elementos al arbol, la funcion publica es add
    public void add(String nombreAgregar){
        objetoNode = addRecursive(objetoNode, nombreAgregar);
    }

    //Añadir elemento de forma recursuva
    private Node addRecursive(Node current, String nombreAagregar) {
        if (current == null) {
            return new Node(nombreAagregar);
        }
        
        int numeroComparacion = nombreAagregar.compareTo(current.value);

        if (numeroComparacion <= 0) {
            current.left = addRecursive(current.left, nombreAagregar);
        } else if (numeroComparacion > 0) {
            current.right = addRecursive(current.right, nombreAagregar);
        }
        return current;
    }

    // Indica si el arbol esta vacio
    public boolean isEmpty() {
        return objetoNode == null;
    }

    // Indica cuantos nodos hay en el arbol
    public int getSize() {
        return getSizeRecursive(objetoNode);
    }
    private int getSizeRecursive(Node current) {
        return current == null ? 0 : getSizeRecursive(current.left) + 1 + getSizeRecursive(current.right);
    }

    // Busca un valor
    public boolean containsNode(String nombreAagregar) {
        return containsNodeRecursive(objetoNode, nombreAagregar);
    }

    private boolean containsNodeRecursive(Node current, String nombreAagregare) {
        if (current == null) {
            return false;
        }
        if ( nombreAagregare == current.getValue()) {
            return true;
        }

        return nombreAagregare.compareTo(current.value) > 0
                ? containsNodeRecursive(current.left, nombreAagregare)
                : containsNodeRecursive(current.right, nombreAagregare);
    }

 
    public void delete(String value) {
        objetoNode = deleteRecursive(objetoNode, value);
    }

    private Node deleteRecursive(Node current, String value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Caso 1: nodo sin hijos
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: nodo con un solo hijo
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // Case 3: nodo con dos hijos
            String smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        
        if (value.compareTo(current.value) < 0) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private String findSmallestValue(Node root) {
        return root.left == null ? objetoNode.value : findSmallestValue(root.left);
    }

    // Recorrido InOrder
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            visit(node.value);
            traverseInOrder(node.right);
        }
    }

    // Recorrido PreOrden
    public void traversePreOrder(Node node) {
        if (node != null) {
            visit(node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // Recorrido PostOrden
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            visit(node.value);
        }
    }

    /* 
    // Recorrido por nivel
    public void traverseLevelOrder() {
        if (objetoNode == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(objetoNode);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(" " + node.value);

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    // Recorrido InOrden no recursivo
    public void traverseInOrderWithoutRecursion() {
        Stack<Node> stack = new Stack<>();
        Node current = objetoNode;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            Node top = stack.pop();
            visit(top.value);
            current = top.right;
        }
    }

    // Recorrido PreOrden sin recursion
    public void traversePreOrderWithoutRecursion() {
        Stack<Node> stack = new Stack<>();
        Node current = objetoNode;
        stack.push(objetoNode);

        while (current != null && !stack.isEmpty()) {
            current = stack.pop();
            visit(current.value);

            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);
        }
    }

    // Recorrido PostOrden sin recursion
    public void traversePostOrderWithoutRecursion() {
        Stack<Node> stack = new Stack<>();
        Node prev = objetoNode;
        Node current = objetoNode;
        stack.push(objetoNode);

        while (current != null && !stack.isEmpty()) {
            current = stack.peek();
            boolean hasChild = (current.left != null || current.right != null);
            boolean isPrevLastChild = (prev == current.right || (prev == current.left && current.right == null));

            if (!hasChild || isPrevLastChild) {
                current = stack.pop();
                visit(current.value);
                prev = current;
            } else {
                if (current.right != null) {
                    stack.push(current.right);
                }
                if (current.left != null) {
                    stack.push(current.left);
                }
            }
        }
    }
*/
    // Visitar un nodo es simplemente mostrar su valor en la pantalla
    private void visit(String value) {
        System.out.print(" " + value);
    }
    
}