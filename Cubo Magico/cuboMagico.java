import javax.swing.JOptionPane;

public class cuboMagico {
    static final int FILAS = 3;
    static final int COLUMNAS = 3;
    static final int DIAGONAL = 2;
    static int sumaDiagonalCuboMagico[];
    static int sumaFilasCuboMagico[];
    static int sumaColumnasCuboMagico[];
    static int cuboMagico[][];
    static int cuadroCuboMagico = 9;
    static int verificacionNumero[];

    public static void main(String[] args) {
        int opcionMenu = 0;

        JOptionPane.showMessageDialog(null, "Bienvenido al juego "
                + "\ndel Cubo Magico!!!");
        iniciarCubo();
        do {
            JOptionPane.showMessageDialog(null, " Atencion Cubo Magico Base\n"
                    + "              Columnas\n"
                    + "          1-1   |   1-2   |   1-3   \n"
                    + "Filas 2-1   |   2-2   |   2-3   \n"
                    + "          3-1   |   3-2   |   3-3   \n");

            try {
                opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Cubo Magico Actual"
                        + "\n   " + cuboMagico[0][0] + "   |   " + cuboMagico[0][1] + "   |   " + cuboMagico[0][2]
                        + "\n   " + cuboMagico[1][0] + "   |   " + cuboMagico[1][1] + "   |   " + cuboMagico[1][2]
                        + "\n   " + cuboMagico[2][0] + "   |   " + cuboMagico[2][1] + "   |   " + cuboMagico[2][2]
                        + "\nMenu\n"
                        + "1-> Ingrese los numeros de la matriz\n"
                        + "2-> Calcular la suma de las filas\n"
                        + "3-> Calcular la suma de las Columnas\n"
                        + "4-> Calcular la suma de las diagonales\n"
                        + "5-> Identificar si el cubo es magico o no\n"
                        + "6-> Salir.\n"
                        + "Ingrese la opcion: "));
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(null,
                        "Error!!! \nEl dato ingresado " + error.getMessage() + ", no es reconocido por el sistema");
            }

            switch (opcionMenu) {
                case 1:
                    try {
                        int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero "
                                + "\nde la fila: "));
                        int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero "
                                + "\nde la columna: "));
                        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero "
                                + "\n ah agregar al cubo magico: "));
                        if (verificadorRangoNumero(numero)) {
                            if (verificacionNumerosIngresados(numero)) {
                                ingresarNumerosRecursivo(fila, columna, numero);
                            } else {
                                JOptionPane.showMessageDialog(null, "Error!!, numero ya ingresado en otro posicion!!!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Error!!, numero fuera de rango!!!");
                        }
                    } catch (NumberFormatException error) {
                        JOptionPane.showMessageDialog(null,
                                "Error!!! \nEl dato ingresado " + error.getMessage()
                                        + ", no es reconocido por el sistema");
                    }
                    break;

                case 2:
                    sumaFilas();
                    try {
                        mostrarSumaFilas(
                                Integer.parseInt(
                                        JOptionPane.showInputDialog(null, "Mostrar suma de la fila 1, 2 o 3: ")));
                    } catch (NumberFormatException error) {
                        JOptionPane.showMessageDialog(null,
                                "Error!!! \nEl dato ingresado " + error.getMessage()
                                        + ", no es reconocido por el sistema");
                    }
                    break;

                case 3:
                    sumaColumnas();
                    try {
                        mostrarSumaColumnas(
                                Integer.parseInt(
                                        JOptionPane.showInputDialog(null, "Mostrar suma de la columna 1, 2 o 3: ")));
                    } catch (NumberFormatException error) {
                        JOptionPane.showMessageDialog(null,
                                "Error!!! \nEl dato ingresado " + error.getMessage()
                                        + ", no es reconocido por el sistema");
                    }
                    break;

                case 4:
                    sumaDiagonal();
                    try {
                        mostrarSumaDiagonal(
                                Integer.parseInt(
                                        JOptionPane.showInputDialog(null, "Mostrar suma de diagonal 1 o 2: ")));
                    } catch (NumberFormatException error) {
                        JOptionPane.showMessageDialog(null,
                                "Error!!! \nEl dato ingresado " + error.getMessage()
                                        + ", no es reconocido por el sistema");
                    }
                    break;

                case 5:
                    verificacionCuboMagico();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Finalizando Programa!!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion No valida!!!");
                    break;
            }

        } while (opcionMenu != 6);

    }

    // Inicio de cubo
    public static void iniciarCubo() {
        cuboMagico = new int[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                cuboMagico[i][j] = 0;
            }
        }
        verificacionNumero = new int[cuadroCuboMagico];
        for (int i = 0; i < cuadroCuboMagico; i++) {
            verificacionNumero[i] = 0;
        }
    }

    // Ingreso de datos dentro de la matriz
    public static void ingresarNumeros(int fila, int columna, int numeroIngresado) {
        if(cuboMagico[fila-1][columna-1] == 0){
            cuboMagico[fila - 1][columna - 1] = numeroIngresado;
        }else{
            JOptionPane.showMessageDialog(null, "Casilla Ocupada!!!");
        }
    }

    // Ingreso de dato verificando las filas y Columnas
    public static void ingresarNumerosRecursivo(int fila, int columna, int numeroIngresado) {
        if (fila > FILAS || columna > COLUMNAS || fila <= 0 || columna <= 0) {
            JOptionPane.showMessageDialog(null, "Error, Fila/Columna Fuera de Limite!!");
        } else {
            ingresarNumeros(fila, columna, numeroIngresado);
        }
    }

    // Ingreso de numero verificando el rango de 1 a 9
    public static boolean verificadorRangoNumero(int numeroIngresado) {
        if (numeroIngresado <= 9 && numeroIngresado >= 1) {
            return true;
        } else {
            return false;
        }
    }

    // Verificacion de numero ingresado, no volver a repetir
    public static boolean verificacionNumerosIngresados(int numero) {
        int aux2 = 0;
        for (int i = 0; i < cuadroCuboMagico; i++) {
            if (aux2 == 0) {
                if (numero == verificacionNumero[i]) {
                    aux2 = 1;
                }
            }
        }

        if (aux2 == 1) {
            return false;
        } else {
            int aux = 0;
            for (int i = 0; i < cuadroCuboMagico; i++) {
                if (aux == 0) {
                    if (verificacionNumero[i] == 0) {
                        verificacionNumero[i] = numero;
                        aux = 1;
                    }
                }
            }
            return true;
        }
    }

    // Suma de filas de la matriz
    public static void sumaFilas() {
        sumaFilasCuboMagico = new int[FILAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                sumaFilasCuboMagico[i] += cuboMagico[i][j];
            }
        }
    }

    // Mostrar el total de la suma de las filas
    public static void mostrarSumaFilas(int fila) {
        switch (fila) {
            case 1:
                JOptionPane.showMessageDialog(null, "La suma de la fila 1,"
                        + "\n es igual a: " + sumaFilasCuboMagico[0]);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "La suma de la fila 2,"
                        + "\n es igual a: " + sumaFilasCuboMagico[1]);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "La suma de la fila 3,"
                        + "\n es igual a: " + sumaFilasCuboMagico[2]);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Numero Invalido!!!");
                mostrarSumaFilas(
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Mostrar suma de la fila 1, 2 o 3: ")));
                break;
        }
    }

    // Sumar las columnas de la matriz
    public static void sumaColumnas() {
        sumaColumnasCuboMagico = new int[COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                sumaColumnasCuboMagico[i] += cuboMagico[j][i];
            }
        }
    }

    // Mostrar la suma de las columnas de la matriz
    public static void mostrarSumaColumnas(int columna) {
        switch (columna) {
            case 1:
                JOptionPane.showMessageDialog(null, "La suma de la columna 1,"
                        + "\n es igual a: " + sumaColumnasCuboMagico[0]);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "La suma de la columna 2,"
                        + "\n es igual a: " + sumaColumnasCuboMagico[1]);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "La suma de la columna 3,"
                        + "\n es igual a: " + sumaColumnasCuboMagico[2]);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Numero Invalido!!!");
                mostrarSumaColumnas(
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Mostrar suma de la columna 1, 2 o 3: ")));
                break;
        }
    }

    // Sumar diagonales de la matriz
    public static void sumaDiagonal() {
        sumaDiagonalCuboMagico = new int[DIAGONAL];

        // Suma Diagonal 1
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (i == j) {
                    sumaDiagonalCuboMagico[0] += cuboMagico[i][j];
                }
            }
        }

        // Suma Diagonal 2
        int j = DIAGONAL;
        for (int i = 0; i < FILAS; i++) {
            sumaDiagonalCuboMagico[1] += cuboMagico[i][j];
            j--;
        }
    }

    // Mostrar el resultado de la suma de las diagonales
    public static void mostrarSumaDiagonal(int diagonal) {
        switch (diagonal) {
            case 1:
                JOptionPane.showMessageDialog(null, "La suma de la diagonal 1,"
                        + "\n es igual a: " + sumaDiagonalCuboMagico[0]);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "La suma de la diagonal 2,"
                        + "\n es igual a: " + sumaDiagonalCuboMagico[1]);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Numero Invalido!!!");
                mostrarSumaDiagonal(
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Mostrar suma de diagonal 1 o 2: ")));
                break;
        }
    }

    // Verificacion si el cubo es magico o no
    public static void verificacionCuboMagico() {
        int numeroCuboMagico = 15;
        int aux1 = 0, aux2 = 0, aux3 = 0;
        sumaFilas();
        sumaColumnas();
        sumaDiagonal();

        if (sumaFilasCuboMagico[0] == numeroCuboMagico && sumaFilasCuboMagico[1] == numeroCuboMagico
                && sumaFilasCuboMagico[2] == numeroCuboMagico) {
            aux1++;
        } else {
            JOptionPane.showMessageDialog(null, "Cubo NO Magico, problemas con las Filas");
        }

        if (sumaColumnasCuboMagico[0] == numeroCuboMagico && sumaColumnasCuboMagico[1] == numeroCuboMagico
                && sumaColumnasCuboMagico[2] == numeroCuboMagico) {
            aux2++;
        } else {
            JOptionPane.showMessageDialog(null, "Cubo NO Magico, problemas con las Columnas");
        }

        if (sumaDiagonalCuboMagico[0] == numeroCuboMagico && sumaDiagonalCuboMagico[1] == numeroCuboMagico) {
            aux3++;
        } else {
            JOptionPane.showMessageDialog(null, "Cubo NO Magico, problemas con las Diagonales");
        }

        if (aux1 == aux2 && aux1 == aux3 && aux2 == aux3) {
            JOptionPane.showMessageDialog(null, "Cubo MAGICO!!!");
        }
    }
}