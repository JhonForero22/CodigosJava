import java.util.Arrays;

public class HashTable {

    // Constructor
    String[] arreglo;
    int tamaño, contador;

    public HashTable(int tamaño) {
        this.tamaño = tamaño;
        arreglo = new String[tamaño];
        Arrays.fill(arreglo, "-1");
    }

    // Funcion Hash
    public void funcionHash(String[] cadenaArreglo, String[] arreglo) {
        int i;
        for (i = 0; i < cadenaArreglo.length; i++) {
            String elemento = cadenaArreglo[i];
            int indiceArreglo = Integer.parseInt(elemento) % 7;
            System.out.println("El indice es " + indiceArreglo + " Para el elemento " + elemento);
            while (arreglo[indiceArreglo] != "-1") {
                indiceArreglo++;
                System.out.println("Ocurrio una colision en el indice " + (indiceArreglo - 1) + " Cambiar al indice "
                        + indiceArreglo);
                indiceArreglo %= tamaño;
            }
            arreglo[indiceArreglo] = elemento;
        }
    }

    // Metodo para mostrar la tabla
    public void mostrar() {
        int incremento = 0, i, j;
        for (i = 0; i < 1; i++) {
            incremento += 8;
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
            System.out.println();
            for (j = incremento - 8; j < incremento; j++) {
                System.out.format("|%3s" + "", j);
            }
            System.out.println("|");
            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }
            System.out.println();
            for (j = incremento - 8; j < incremento; j++) {
                if (arreglo[j].equals("-1")) {
                    System.out.print("|");
                } else {
                    System.out.print(String.format("|%3s" + "", arreglo[j]));
                }
            }
            System.out.println("|");
            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }
        }
    }

    //Metodo para buscar clave
    public String buscarClave(String elemento){
        int indiceArreglo = Integer.parseInt(elemento)%7;
        int contador = 0;
        while(arreglo[indiceArreglo] != "-1"){
            if(arreglo[indiceArreglo]==elemento){
                System.out.println("");
                System.out.println("El elemento " + elemento + " Fue encontrado en el indice " + indiceArreglo);
                return arreglo[indiceArreglo];
            }
            indiceArreglo++;
            indiceArreglo %= tamaño;
            contador++;
            if(contador > 7){
                break;
            }            
        }
        return null;
    }
}
