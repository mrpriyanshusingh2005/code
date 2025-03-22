import java.util.Arrays;

public class Construct2DArraySolution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length)
            return new int[0][0];  
        int[][] arr = new int[m][];
        for (int i = 0; i < m; i++) {
            arr[i] = Arrays.copyOfRange(original, i * n, i * n + n);
        }
        return arr;
    }
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6};
        int m = 2, n = 3;

        int[][] result = construct2DArray(original, m, n);
        System.out.println("Constructed 2D Array:");
        print2DArray(result);
    }
}
