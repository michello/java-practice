public class MultiDimensionalArrs {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.println(grid[1][2]);         // 7

        String[][] texts = new String[2][3];
        System.out.println(texts[0][1]);       // null

        texts[0][1] = "Hello there";
        System.out.println(texts[0][1]);       // Hello there

        for (int[] row : grid) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
        }

        System.out.println();

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
        }

        System.out.println();
    }
}