import java.util.Arrays;

public class N_REINAS {
    private int N;
    private int[][] tablero;

    /**
     * Constructor de la clase NReinas.
     *
     * @param N Tama�o del tablero y n�mero de reinas a colocar.
     */
    public N_REINAS(int N) {
        this.N = N;
        tablero = new int[N][N];
    }

    /**
     * M�todo para iniciar la soluci�n del problema de las N-Reinas.
     *
     * @return true si se encuentra una soluci�n, false en caso contrario.
     */
    public boolean resolver() {
        if (!colocarReinas(0)) {
            System.out.println("No hay soluci�n");
            return false;
        }
        imprimirTablero();
        return true;
    }

    /**
     * M�todo recursivo que intenta colocar las reinas fila por fila.
     *
     * @param fila N�mero de fila actual.
     * @return true si se encuentra una disposici�n v�lida, false en caso contrario.
     */
    private boolean colocarReinas(int fila) {
        if (fila >= N) {
            return true;
        }
        for (int columna = 0; columna < N; columna++) {
            if (esSeguro(fila, columna)) {
                tablero[fila][columna] = 1;
                if (colocarReinas(fila + 1)) {
                    return true;
                }
                tablero[fila][columna] = 0;
            }
        }
        return false;
    }

    /**
     * Verifica si es seguro colocar una reina en la posici�n dada.
     *
     * @param fila    Fila donde se quiere colocar la reina.
     * @param columna Columna donde se quiere colocar la reina.
     * @return true si es seguro, false en caso contrario.
     */
    private boolean esSeguro(int fila, int columna) {
        for (int i = 0; i < fila; i++) {
            if (tablero[i][columna] == 1) {
                return false;
            }
        }

        for (int i = fila, j = columna; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }

        for (int i = fila, j = columna; i >= 0 && j < N; i--, j++) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    /**
     * Imprime el tablero con la disposici�n de las reinas.
     */
    private void imprimirTablero() {
        for (int[] fila : tablero) {
            System.out.println(Arrays.toString(fila));
        }
    }

    /**
     * M�todo principal para ejecutar el programa.
     *
     * @param args Argumentos de l�nea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        int N = 5;
        N_REINAS solucion = new N_REINAS(N);
        solucion.resolver();
    }
}
