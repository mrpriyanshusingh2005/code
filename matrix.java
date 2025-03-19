
import java.util.*;

class matrix {

    static void setMatrixZeroes(int[][] mat) {
        int n = mat.length, m = mat[0].length;

        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (rows[i] || cols[j]) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = { 
            { 0, 1, 2, 0 },
            { 3, 4, 0, 2 },
            { 1, 3, 1, 5 }
        };

        setMatrixZeroes(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
