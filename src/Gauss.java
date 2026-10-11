public class Gauss {
    public static double[][] eliminacionGaussiana(double[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                double factor = matriz[k][i] / matriz[i][i];
                for (int j = i; j <= n; j++) {
                    matriz[k][j] -= factor * matriz[i][j];
                }
            }
        }
        return matriz;
    }
}