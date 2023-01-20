package arbolbinariotexto;

import javax.swing.JOptionPane;

public class ArbolBinariotexto {

    public static void main(String[] args) {
        int opcion = 0;
        String nombre;
        arbolbin arbcreado = new arbolbin();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar nodo\n"
                        + "2. Recorrer el árbol INORDEN\n"
                        + "3. Salir \n"
                        + "Elige una opción...: ", "Árbol binario de texto",
                        JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo... ", "Agregando nodo",
                                JOptionPane.QUESTION_MESSAGE);
                        arbcreado.agregaNodo(nombre);
                        break;
                    case 2:
                        if (!arbcreado.arbvacio()) {
                            System.out.println();
                            arbcreado.inOrden(arbcreado.raiz);
                        } else {
                            JOptionPane.showInputDialog(null, "El árbol esta vacio", "¡Cuidado!",
                                    JOptionPane.QUESTION_MESSAGE);
                        }
                        break;
                    case 3:
                        JOptionPane.showInputDialog(null, "Aplicación finalizada ", "Fin",
                                JOptionPane.QUESTION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showInputDialog(null, "Opción incorrecta", "¡Cuidado!",
                                JOptionPane.QUESTION_MESSAGE);
                        break;

                }
            } catch (NumberFormatException n) {
                if ("null".equals(n.getMessage())) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                }
            }
        } while (opcion != 3);
    }

}
