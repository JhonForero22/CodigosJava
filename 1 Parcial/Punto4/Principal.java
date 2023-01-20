package Punto4;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Principal {

    private static int N = 5;
    public static Persona persona[] = new Persona[N];

    public static void main(String[] args) {

        // Variables y Constantes
        int opcion;
        int cedulaP, sueldoP, diaP, mesP, anioP;
        String nombreP, apellidoP;

        // Iniciar arreglo de objetos
        for (int i = 0; i < persona.length; i++) {
            persona[i] = new Persona();
        }

        // Iniciar Escaneer
        Scanner s = new Scanner(System.in);

        // Inicar usuario Prueba
        persona[0] = new Persona(123456789, "Practica", "Ejemplo", 2003, 10, 24, 15000);

        do {
            System.out.println("Menu");
            System.out.println("1-> Crear una persona nueva");
            System.out.println("2-> Listar todas las personas");
            System.out.println("3-> Indicar el Sueldo promedio de todas las personas registradas");
            System.out.println("4-> Indicar el nombre completo de la persona más joven");
            System.out.println("5-> Salir del programa");
            System.out.print("Ingrese la opcion: ");
            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    limpiarPantall();
                    int posicionUsuarioNuevo = 0;
                    for (int i = 0; i < persona.length; i++) {
                        if (persona[i].getNombre() != null) {
                            posicionUsuarioNuevo++;
                        }
                    }
                    if (posicionUsuarioNuevo != -1) {
                        System.out.print("Cedula usuario nuevo: ");
                        cedulaP = s.nextInt();
                        System.out.print("Nombre usuario nuevo: ");
                        nombreP = s.next();
                        System.out.print("Apellido usuari nuevo: ");
                        apellidoP = s.next();
                        System.out.println("Ingrese la fecha de nacimiento: ");
                        System.out.print("Dia: ");
                        diaP = s.nextInt();
                        System.out.print("Mes: ");
                        mesP = s.nextInt();
                        System.out.print("Año: ");
                        anioP = s.nextInt();
                        System.out.print("Ingrese el sueldo de la persona: ");
                        sueldoP = s.nextInt();
                        persona[posicionUsuarioNuevo] = new Persona(cedulaP, nombreP, apellidoP, anioP, mesP, diaP,
                                sueldoP);
                        System.out.println("Usuario Creado con exito!!!");
                    } else {
                        System.out.println("Base de datos llena!!!");
                    }

                    break;
                case 2:
                    limpiarPantall();

                    for (int i = 0; i < persona.length; i++) {
                        if (persona[i].getCedula() != 0) {
                            imprimirDatos(i);
                        }
                    }
                    break;
                case 3:
                    limpiarPantall();
                    int cantidadPersonas = 0;
                    int suledoTotalPersonas = 0;

                    for (int i = 0; i < persona.length; i++) {
                        if (persona[i].getCedula() != 0) {
                            cantidadPersonas++;
                            suledoTotalPersonas += persona[i].getSueldo();
                        }
                    }
                    System.out.println("El sueldo promedio entre las personas es igual a : $"
                            + (suledoTotalPersonas / cantidadPersonas));
                    break;
                case 4:
                    limpiarPantall();
                    int edadPersonas[] = new int[N];
                    for (int i = 0; i < persona.length; i++) {
                        if (persona[i].getCedula() != 0) {
                            edadPersonas[i] = calcularEdad(persona[i].getDia(), persona[i].getMes(),
                                    persona[i].getAnio());
                        }
                    }
                    int posicionPersonaMenor = 0;
                    int personaMenor = edadPersonas[0];
                    // Saber personas mas joven
                    for (int i = 0; i < persona.length; i++) {
                        if (persona[i].getCedula() != 0) {
                            if (edadPersonas[i] < personaMenor) {
                                posicionPersonaMenor = i;
                            }
                        }

                    }

                    System.out.println("El nombre y apellido de la persona mas joven es: ");
                    System.out.printf("Nombre " + persona[posicionPersonaMenor].getNombre() + "\n");
                    System.out.printf("Apellido " + persona[posicionPersonaMenor].getApellido() + "\n");
                    break;
                case 5:
                    limpiarPantall();
                    System.out.print("Finalizando Programa!!!");

                    break;
                default:
                    System.out.print("Opcion Invalida!!!");
            }

        } while (opcion != 5);
        s.close();
    }

    public static void imprimirDatos(int numero) {
        System.out.println("----------------------");
        System.out.println("Usuario Numero " + (numero + 1));
        System.out.println("Nombre: " + persona[numero].getNombre());
        System.out.println("Apellido: " + persona[numero].getApellido());
        System.out.println("Cedula: " + persona[numero].getCedula());
        System.out.println("Fecha de Nacimiento: Dia: " + persona[numero].getDia() + " Mes: " + persona[numero].getMes()
                + " Año: " + persona[numero].getAnio());
        System.out.println("Sueldo: " + persona[numero].getSueldo());
    }

    public static int calcularEdad(int dia, int mes, int anio) {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        Period periodo = Period.between(fechaNacimiento, fechaHoy);
        return periodo.getYears();
    }

    public static void limpiarPantall() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
