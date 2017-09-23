//1.4.14 4-sum. Develop an algorithm for the 4-sum problem.

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import java.util.Arrays;

public class FourSum {

  public static void main(String[] args) {
    int[] a = In.readInts(args[0]);
    int N = a.length;
    int count = 0;
    
    Arrays.sort(a);
    
    for (int i = 0; i < a.length; i++) {
      for (int j = i+1; j < a.length; j++) {
        for (int k = j+1; k < a.length; k++) {
          int threeSum = -(a[i] + a[j] + a[k]);
          int index = BinarySearch.indexOf(a, threeSum);
              
          if (index > k) {
            count++;
            System.out.println(threeSum);
            System.out.println(a[i] + " " + a[j] + " " + a[k] + " " + a[index] + " = 0");
          }
        }
      }
    }
    System.out.println(count);
  }
}