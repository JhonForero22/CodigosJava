/*
 Ultima vez modificado 10/10/2022
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Se crea un escaner para recibir datos
        Scanner eScanner = new Scanner(System.in);
        //Se crea la variable para las opciones del menu
        int opcMenu = 0;
        //Se invoca la clase lista, y se crea una nueva lista para agregar los datos del nodo
        Lista listaPrueba = new Lista<>();
        //Metodo limpíar pantalla
        listaPrueba.limpiarPantall();


        do {
            //Imprimir menu
            System.out.print("Menu: "
                    + "\n 1 -> Insertar persona"
                    + "\n 2 -> Buscar persona"
                    + "\n 3 -> Eliminar persona"
                    + "\n 4 -> Listar personas"
                    + "\n 5 -> Salir"
                    + "\n Ingrese la opcion seleccionada: ");
            //Campo para ingresar valor seleccionado
            opcMenu = eScanner.nextInt();

            //Opciones ingresada en opcMenu
            switch (opcMenu) {
                //Caso 1:
                case 1:
                    //Se crea atributos para guardar la informacion de la persona
                    String nombre, Correo;
                    int cedula;
                    //Mensaje y solicutud de ingreso de datos
                    System.out.print("Ingrese el nombre de la persona: ");
                    nombre = eScanner.next();
                    System.out.print("Ingrese el correo de la persona: ");
                    Correo = eScanner.next();
                    System.out.print("Ingrese la cedula de la persona: ");
                    cedula = eScanner.nextInt();
                    //Si la persona ya esta registrada
                    if (listaPrueba.verificarPersona(cedula) == true) {
                        //Se imprime el sigueinte mensaje
                        System.out.println("Usuario(Cedula) ya registrado!!!");
                        //De lo contrario
                    } else {
                        //Se añade a a lista el metodo con la clase persoa
                        listaPrueba.insertarDato(new Persona(nombre, Correo, cedula));
                        //Se imprime que se añadio correctamente
                        System.out.println(nombre + " agregado correctamente!!! ");
                    }
                    break;
                    //Caso 2
                case 2:
                //Se crear una variable de la cedula
                    int cedula1;
                    //Mensaje y solitud de datos
                    System.out.print("Ingrese el numero de la cedula a buscar: ");
                    cedula1 = eScanner.nextInt();
                    //Invoca el metodo de lista y se ingresa el dato
                    listaPrueba.buscarPersona(cedula1);
                    break;
                    //Caso 3
                case 3:
                //Se crear una variable de la cedula
                    int cedula2;
                    //Mensaje y solitud de datos
                    System.out.print("Ingrese el numero de la cedula a borrar: ");
                    cedula2 = eScanner.nextInt();
                    //Invoca el metodo de lista y se ingresa el dato
                    listaPrueba.eliminarPersona(cedula2);
                    break;
                //Case 4
                    case 4:
                //Invoca el metodo de lista y se ingresa el dato
                    listaPrueba.imprimirDatos();
                    break;
                    //Caso 5
                case 5:
                //Mnesaje 
                    System.out.println("Finalizando codigo!!!!");
                    break;
                    // Default no ingreso ninguna opcion valida
                default:
                //Mnesaje
                    System.out.println("Opcion Invalida!!!");
            }
            //Se repite mientras la opcion ingresdad sea diferente de 5
        } while (opcMenu != 5);

        //Se cierra la conexion con el escanner
        eScanner.close();
    }
}