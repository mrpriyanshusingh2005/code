import java.util.*;

public class ShiftGridSolution {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        List<Integer> arr = new ArrayList<>();
        for (int[] row : grid) {
            for (int num : row) {
                arr.add(num);
            }
        }
        int totalElements = m * n;
        k = k % totalElements;  
        List<Integer> shifted = new ArrayList<>();
        for (int i = totalElements - k; i < totalElements; i++) {
            shifted.add(arr.get(i));
        }
        for (int i = 0; i < totalElements - k; i++) {
            shifted.add(arr.get(i));
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(shifted.get(i * n + j));
            }
            result.add(row);
        }
        return result;
    }
    public static void printGrid(List<List<Integer>> grid) {
        for (List<Integer> row : grid) {
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int k = 1;

        List<List<Integer>> shiftedGrid = shiftGrid(grid, k);
        System.out.println("Shifted Grid:");
        printGrid(shiftedGrid);
    }
}
