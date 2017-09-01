import java.util.Arrays;

//Write a code fragment that prints the contents 
//of a two-dimensional boolean array, using * to 
//represent true and a space to represent false. 
//Include row and column numbers.

public class Ex_1_1_11 {
  public static void main(String[] args) {
    boolean[][] arr = {
        {true, false},
        {false, false}
    };
    
    for (int i = 0; i<arr.length; i++) {
      for (int j = 0; j<arr[0].length; j++){
        System.out.println("row " + i + " - column " + j);
        if (arr[i][j]) {
          System.out.println('*');
        } else {
          System.out.println(' ');
        }
      }
    }
  }
}
