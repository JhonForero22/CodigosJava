import java.util.Scanner;

public class Pila {

    // Variable para resivair datos
    Scanner eScanner = new Scanner(System.in);

    // Atributos de la pila
    // Tamaño del arreglo que va a tener la Pila
    int pilaNumerica[] = new int[5];
    // Variable inicial para llevar los datos ingresados a la Pila
    int tope = -1;

    // Metodo para ingresar datos en la pila
    // push -> Empujar
    public void push() {

        // Si la variable tope es mayor o igual al tamaño de la Pila-1, indica que la
        // Pila esta llena
        if (tope >= pilaNumerica.length - 1) {
            // Se imprime el mensaje
            System.out.println("La pila esta llena.");
            // Si no se cumple la condiccion
        } else {
            // Se aumenta en 1, la variable tope
            tope++;
            // Imprime el mensaje para solicitar que se ingrese el dato a el arreglo
            System.out.println("Ingresar el dato:");
            // Como se ingreso en este if y la variable tope inicio en -1, se aumenta y
            // queda igual a 0
            // por lo cual se procede a guardar en la posicion 0 del arreglo el numero
            // ingresado
            pilaNumerica[tope] = eScanner.nextInt();
        }
    }

    // Metodo para retirar el ultimo dato ingresado de la pila
    // pop -> Estallido
    public int pop() {
        // Si la variable tope sigue igual con su valor inicial, indica que no se ah
        // agregado datos a la lista
        if (tope == -1) {
            // Se imprime el mensaje
            System.out.println("La pila esta vacia!!!");
            // Se rotorna la variable tope, disminuida normal sin cambios porque no se borro nada;
            return tope;
            // Si no
        } else {
            // Imprime un mensaje con el dato y la posicion del arreglo eliminado
            System.out.println(
                    "Sea ah eliminado el elemento " + pilaNumerica[tope] + " de la pila, en la posicion " + (tope + 1));
            //Se procede a borrar la primera posicion de la cola y se iguala a 0
            pilaNumerica[tope] = 0;
            // Se rotorna la variable tope, disminuida en -1;
            return tope--;
        }
    }

    //Metodo para mostrar los datos que tiene toda la pila dentro del arreglo
    public void mostrarPila(){
        //Mensaje para decir que vamos a imprimir los datos de la pila
        System.out.println("Datos de la pila");
        //Creamos un for, que iniciara del tamaño del arreglo-1
        //El cual se ejecutara mientras el tope sea mayor o igual a 0
        // Y se ira restando (-1) cada vez que se ejecute el for
        for(int tope=(pilaNumerica.length-1);tope>=0;tope--){
            //Se procede a imprimir un mensaje con los datos de la Pila
            System.out.println("Posicion en el arreglo " + (tope+1) + ", valor que tiene asignado es " + pilaNumerica[tope]);
        }
    }
}