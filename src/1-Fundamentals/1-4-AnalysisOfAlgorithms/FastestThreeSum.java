//1.4.15 Faster 3-sum. As a warmup, develop an implementation TwoSumFaster that 
//uses a linear algorithm to count the pairs that sum to zero after the array is 
//sorted (in- stead of the binary-search-based linearithmic algorithm). Then apply a 
//similar idea to develop a quadratic algorithm for the 3-sum problem.

import java.util.Arrays;
import edu.princeton.cs.algs4.In;

public class FastestThreeSum {

  public static void main(String[] args) {
//    int[] a = In.readInts(args[0]);
    int[] a = {-10, -9, -3, -1, 0, 4, 5, 6, 10, 19};
    int j;
    int k = a.length - 1; 
    int count = 0;
    Arrays.sort(a);
    
    for(int i = 0; i < a.length-2; i++) {
      j = i + 1;
      
      while (j < k) {
        if (a[i] + a[j] + a[k] == 0) {
          System.out.println(a[i] + " " + a[j] + " " + a[k] + " = 0" );
          count++;
          j++;
          k--;
        } else if (a[i] + a[j] + a[k] > 0) {
          k--;
        } else if (a[i] + a[j] + a[k] < 0) { 
          j++;
        }
      }
    }
    
    System.out.println(count);
  }
}
