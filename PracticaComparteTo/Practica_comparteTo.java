//Ejercicio Practico de compareTo

public class Practica_comparteTo{
    public static void main(String[] args) {
        String apellido1 = "Forero";
        String apellido2 = "Velasco";
        int numeroComparacion;
        //.compareTo, compara dos variables, dando como resultado en este caso:
        // 0, indica que la palabra es igual
        // -, significa que la palabra dos es mayor que la primera
        // +, significa que la primer palabra es mayor que la segunda
        numeroComparacion = apellido1.compareTo(apellido2);

        if(numeroComparacion>0){
            System.out.println("El numero de comparacion es " + numeroComparacion + ", por lo que la palabra " + apellido1 + ", es mayor que " + apellido2);
        }else if(numeroComparacion<0){
            System.out.println("El numero de comparacion es " + numeroComparacion + ", por lo que la palabra " + apellido2 + ", es mayor que " + apellido1);
        }else{
            System.out.println("El numero de comparacion es " + numeroComparacion + ", por lo que las palabras son iguales!!!");
        }
    }
}