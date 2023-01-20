import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Lista listaPrueba = new Lista();
        int OpcionMenu = 0;
        Scanner eScanner = new Scanner(System.in);
        do {
            System.out.println("Bienvenido!!!");
            System.out.println("Menu: ");
            System.out.println("1 -> Agregar una persona al Nodo");
            System.out.println("2 -> Listar todas las personas en el Nodo");
            System.out.println("3 -> Buscar por posicion en el Nodo");
            System.out.println("4 -> Salir");
            System.out.print("Ingresa tu opcion: ");
            OpcionMenu = eScanner.nextInt();
            limpiarPantalla();
            switch (OpcionMenu) {
                case 1:
                String Nombre, Apellido;
                int Cedula, Sueldo;
                // Fecha de nacimiento
                int Dia, Mes, Año;
                    System.out.print("Ingrese el nombre de la persona: ");
                    Nombre = eScanner.next();
                    System.out.print("Ingrese el apellido de la persona: ");
                    Apellido = eScanner.next();
                    System.out.print("Ingrese la cedula de la persona: ");
                    Cedula = eScanner.nextInt();
                    System.out.print("Ingrese el sueldo de la persona: ");
                    Sueldo = eScanner.nextInt();
                    // Fecha de cumpleaños
                    System.out.print("Ingrese el dia de Nacimimiento de la persona: ");
                    Dia = eScanner.nextInt();
                    System.out.print("Ingrese el mes de Nacimimiento de la persona: ");
                    Mes = eScanner.nextInt();
                    System.out.print("Ingrese el Año de Nacimimiento de la persona: ");
                    Año = eScanner.nextInt();
                    listaPrueba.insertarLista( new Persona(Nombre,Apellido,Cedula,Sueldo,Dia,Mes,Año));
                    System.out.println(Nombre + " Agregado con Exito");
                    break;
                case 2:
                    listaPrueba.mostrarLista();
                    break;
                case 3:
                    int CedulaABuscar;
                    System.out.print("Ingrese el numero de Cedula a buscar: ");
                    CedulaABuscar = eScanner.nextInt();
                    listaPrueba.buscarDato(CedulaABuscar);
                    break;
                case 4:
                    System.out.println("Finalizando Programa!!!");
                    break;
                default:
                    System.out.println("Opcion NO valida!!!");
            }
        } while (OpcionMenu != 4);
        eScanner.close();
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
