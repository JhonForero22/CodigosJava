package ejercicios.metodosorganizacion;

import java.util.Random;

public class MetodosOrganizacion {

    public static void main(String[] args) {

        // Tamaño de lista
        int tamañoLista = 10;

        // Creaccion de la lista
        int lista[] = new int[tamañoLista];

        // Llenar el arreglo de numeros
        System.out.println("\nLista desordenada: ");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 100) + 1;
        }

        // Imprimir arreglo
        imprimirArreglo(lista);

        // Arreglo en modo burbuja
        System.out.println("\nReorganizando el arreglo por el metodo burbuja: ");
        imprimirArreglo(Burbuja(lista));

        // Arreglo en modo de seleccion
        System.out.println("\nReorganizando el arreglo por el metodo de seleccion: ");
        imprimirArreglo(Seleccion(lista));

        // Arreglo en modo de insercion
        System.out.println("\nReorganizando el arreglo por el metodo de insercion: ");
        imprimirArreglo(Insercion(lista));

        // Arreglo en modo de Shellsort
        System.out.println("\nReorganizando el arreglo por el metodo de Shellsort: ");
        imprimirArreglo(Shellsort(lista));

        // Arreglo en modo de Margesort
        System.out.println("\nReorganizando el arreglo por el metodo de Mergesort: ");
        imprimirArreglo(Mergesort(lista, 0, lista.length-1));

    }

    // Organizacion metodo burbuja
    public static int[] Burbuja(int lista[]) {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    // Intercambiar elementos
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
        return lista;
    }

    // Organizacion metodo seleccion
    public static int[] Seleccion(int lista[]) {

        for (int i = 0; i < (lista.length - 1); i++) {
            // Encontrar el índice del valor mínimo en la lista sin ordenar
            int menorIndice = i;
            for (int j = (i + 1); j < lista.length; j++) {
                if (lista[j] < lista[menorIndice]) {
                    menorIndice = j;
                }
            }

            // Intercambiar el valor mínimo con el primer valor sin ordenar
            int temp = lista[i];
            lista[i] = lista[menorIndice];
            lista[menorIndice] = temp;
        }
        return lista;
    }

    // Organizacion metodo insercion
    public static int[] Insercion(int lista[]) {

        for (int i = 0; i < lista.length; i++) {
            int key = lista[i];
            int j = i - 1;

            // Mover los elementos mayores que la llave hacia adelante
            while (j >= 0 && lista[j] > key) {
                lista[j + 1] = lista[j];
                j--;
            }

            // Insertar la llave en su posición correcta
            lista[j + 1] = key;
        }

        return lista;
    }

    // Organizacion metodo Shellsort
    public static int[] Shellsort(int lista[]) {
        // Establecer los intervalos
        int[] intervals = { 5, 3, 1 };

        for (int interval : intervals) {
            // Ordenar usando el intervalo actual
            for (int i = interval; i < lista.length; i++) {
                int temp = lista[i];
                int j;
                for (j = i; j >= interval && lista[j - interval] > temp; j -= interval) {
                    lista[j] = lista[j - interval];
                }
            }
        }

        return lista;
    }

    // Organizacion metodo Mergesort
    public static int[] Mergesort(int lista[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            
            // Ordenar recursivamente las dos mitades
            Mergesort(lista, l, m);
            Mergesort(lista, m+1, r);
            
            // Mezclar las dos mitades ordenadas
            merge(lista, l, m, r);
        }
        return lista;
    }

    public static void merge(int[] array, int l, int m, int r) {
        // Crear dos subarreglos temporales
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];

        // Copiar los elementos a los subarreglos temporales
        for (int i = 0; i < left.length; i++) {
            left[i] = array[l + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = array[m + 1 + i];
        }

        // Mezclar los dos subarreglos temporales en el arreglo original
        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Imprimir arreglo
    public static void imprimirArreglo(int lista[]) {
        System.out.print("[");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(" " + lista[i]);
        }
        System.out.println(" ]");
    }

}
