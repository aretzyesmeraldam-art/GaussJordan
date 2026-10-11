public class GaussJordan {

    public static void main(String[] args) {
        // El main se mantiene limpio, invocando al método modular principal
        ejecutarGaussJordan();
    }

    public static void ejecutarGaussJordan() {
        double[][] matriz = {
                {2, 1, -1, 8},
                {-3, -1, 2, -11},
                {-2, 1, 2, -3}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Reutilización de la triangulación superior de la clase Gauss
        Gauss.eliminacionGaussiana(matriz);

        // Normalización y barrido superior
        int n = matriz.length;
        for (int i = n - 1; i >= 0; i--) {
            double pivote = matriz[i][i];
            for (int j = i; j <= n; j++) {
                matriz[i][j] /= pivote;
            }

            for (int k = i - 1; k >= 0; k--) {
                double factor = matriz[k][i];
                for (int j = i; j <= n; j++) {
                    matriz[k][j] -= factor * matriz[i][j];
                }
            }
        }

        System.out.println("\nMatriz final (Gauss-Jordan):");
        imprimirMatriz(matriz);

        System.out.println("\nResultados:");
        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i + 1) + " = " + matriz[i][n]);
        }
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (double[] fila : matriz) {
            for (double val : fila) {
                System.out.printf("%10.4f ", val);
            }
            System.out.println();
        }
    }
}