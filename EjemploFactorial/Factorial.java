/* 
 Fatorial de un Numero
 Ultima vez modificado 10/10/2022
*/
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        // Factorial
        Scanner eScanner = new Scanner(System.in);
        int numeroFactorial;
        System.out.print("Ingrese el numero a sacar el factorial:");
        numeroFactorial = eScanner.nextInt();
        System.out.println("El resultado de factorial de " + numeroFactorial + " es " + numeroF(numeroFactorial));
        eScanner.close();
    }

    public static int numeroF(int numero) {
        int resultadoFactorial;
        int factorialCambiante = 1;
        for (int i = 1; i < numero; i++) {
            factorialCambiante = factorialCambiante * i;
        }
        resultadoFactorial = numero * factorialCambiante;
        return resultadoFactorial;
    }

}