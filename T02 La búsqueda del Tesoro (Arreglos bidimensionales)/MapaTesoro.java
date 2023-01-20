import java.util.Scanner;

public class MapaTesoro {

    /*
     * Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
     * cuatro filas por cinco columnas. El usuario intentará averiguar dónde
     * está el tesoro.
     */

    public static void main(String[] args) {
        // Se definen la variable donde se almacenera toda la informacion.
        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;

        // Variable para crear el Scanner de lectura de datos
        Scanner s = new Scanner(System.in);

        // inicializa el array
        int FILA = 4, COLUMNAS = 5;
        int MapaTesoro[][] = new int[FILA][COLUMNAS], MapaTesoroMinaFalso[][] = new int[FILA][COLUMNAS];

        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                MapaTesoro[i][j] = VACIO;
            }
        }

        // coloca la mina
        int aleatorioMinaFila, aleatorioMinaColumna;
        aleatorioMinaFila = (int) (Math.random() * FILA);
        aleatorioMinaColumna = (int) (Math.random() * COLUMNAS);
        MapaTesoroMinaFalso[aleatorioMinaFila][aleatorioMinaColumna] = MINA;

        // coloca el tesoro -- recuerda que no coincida con la mina
        int aleatorioTesoroFila, aleatorioTesoroColumna;
        do {
            aleatorioTesoroFila = (int) (Math.random() * FILA);
            aleatorioTesoroColumna = (int) (Math.random() * COLUMNAS);
        } while (aleatorioMinaFila == aleatorioTesoroFila || aleatorioMinaColumna == aleatorioTesoroColumna);

        MapaTesoroMinaFalso[aleatorioTesoroFila][aleatorioTesoroColumna] = TESORO;

        // juego
        System.out.println("\t\t\tBienvenido !!!");
        System.out.println("\t\t\tJuego del Mapa Del Tesoro!!!");

        int resultado = 0;
        do {
            // Pinta el cuadrante
            // Imprimir Cuadro Magico:
            System.out.print("\t\t\tCuadro Magico Base\n");
            for (int i = 0; i < FILA; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    System.out.print("\t\t\t["+ MapaTesoro[i][j] +"]");
                    //System.out.print("[X]");
                }
                System.out.print("\n");
            }
            System.out.print("\n");

            // pide las coordenadas
            int cordenadaFila, cordenadaColumna;

            System.out.println("\t\t\tIngrese valores entre 1 y 4");
            System.out.print("\t\t\tIngrese el numero de la fila: ");
            cordenadaFila = Integer.parseInt(s.nextLine());
            System.out.println();

            System.out.println("\t\t\tIngrese valores entre 1 y 5");
            System.out.print("\t\t\tIngrese el numero de la columna: ");
            cordenadaColumna = Integer.parseInt(s.nextLine());
            System.out.println();

            //Limpiador de pantalla
            System.out.print("\033[H\033[2J");  
            System.out.flush();  

            // recuerda que el juego acaba al encontrar la mina (pierde) o al encontrar el
            // tesoro (gana)
            // 1-> Encontro la Mina 2-> ENcontro el tesoro
            
            if(cordenadaFila<=4 && cordenadaFila>=1 && cordenadaColumna<=5 && cordenadaColumna>=1){
                if (MapaTesoroMinaFalso[cordenadaFila-1][cordenadaColumna-1] == MINA) {
                    resultado = 1;
                    System.out.println("\t\t\tBOOOOOOOOMM!!!");
                    System.out.println("\t\t\tHas encontrado la Mina :( ");
                    System.out.println("\t\t\tPerdiste!!!");
                } else if (MapaTesoroMinaFalso[cordenadaFila-1][cordenadaColumna-1] == TESORO) {
                    resultado = 2;
                    System.out.println("\t\t\tHas encontrado el tesoro :)");
                    System.out.println("\t\t\tFalicidades!!!");
                }else{
                    //System.out.println("Casilla ya seleccioanda!!!");
                    //System.out.println("Se procede a reescribir");
                    MapaTesoro[cordenadaFila-1][cordenadaColumna-1] = INTENTO;
                }
            }else{
                System.out.println("Cordenada en Fila/Columna no admitido!!!.");
                System.out.println("Ingrese un valor valido.\n");
            }
        } while (resultado == 0);

        // mira lo que hay en las coordenadas indicadas por el usuario
        System.out.println("\t\t\tFinalizando Juego!!! Muchas gracias!!!");
    }
}