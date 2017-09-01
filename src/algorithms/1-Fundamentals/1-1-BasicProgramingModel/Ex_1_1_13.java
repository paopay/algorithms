//Write a code fragment to print the transposition
//(rows and columns changed) of a two-dimensional 
//array with M rows and N columns.

public class Ex_1_1_13 {
  public static void main(String[] args) {
    int[][] old = {
        {1,  3,  5},
        {4,  6,  8},
        {10, 12, 14},
        {20, 40, 99}
    };
    
    // switch the length of arrays
    int[][] transposed = new int[old[0].length][old.length];

    // for transposing
    for (int rows = 0; rows < old.length; rows++) {
      for (int cols = 0; cols < old[0].length; cols++) {
        transposed[cols][rows] = old[rows][cols];
      }
    }
    
    // for printing
    for (int i = 0; i < transposed.length; i++) {
      for (int j = 0; j < transposed[0].length; j++) {
        System.out.printf("%3d ", transposed[i][j]);
      }
      System.out.print('\n');
    }
  }
}
