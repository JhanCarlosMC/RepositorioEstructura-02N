public class Main {
    public static void main(String[] args) {
//        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        recorrerArreglo(arreglo, 0);

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        recorrerMatriz(matriz,0,0);
//        recorrerMatrizDos(matriz,0,0);
        recorrerMatrizTres(matriz,0,0);
    }


    public static void recorrerMatriz(int[][] matriz, int fila, int columna){
        if(fila >= matriz.length){
            return; //Caso Base
        }
        if(columna <= matriz[fila].length-1){
            System.out.print(matriz[fila][columna]);
            recorrerMatriz(matriz, fila, columna+1);
        }else{
            System.out.println("");
            recorrerMatriz(matriz, fila+1, 0);
        }
    }

    public static void recorrerMatrizDos(int[][] matriz, int fila, int columna){
        if(columna >= matriz[0].length){
            return; //Caso Base
        }
        if(fila <= matriz[columna].length-1){
            System.out.print(matriz[fila][columna]);
            recorrerMatrizDos(matriz, fila+1, columna);
        }else{
            System.out.print("");
            recorrerMatrizDos(matriz, 0, columna+1);
        }
    }

    public static void recorrerMatrizTres(int[][] matriz, int fila, int columna){
        if(fila >= matriz.length || columna >= matriz[0].length){
            return; //Caso Base
        }

        System.out.print(matriz[fila][columna]);
        recorrerMatrizTres(matriz, fila+1, columna+1);

//        if(columna <= matriz[fila].length-1){
//            System.out.print(matriz[fila][columna]);
//            recorrerMatriz(matriz, fila+1, columna+1);
//        }else{
//            System.out.println("");
//            recorrerMatriz(matriz, fila+1, 0);
//        }
    }


    public static void recorrerArreglo(int[] arreglo, int i) {
        if (i >= arreglo.length) {
            return;
        }

        System.out.print(arreglo[i]);
        recorrerArreglo(arreglo, i + 1);
    }
}
