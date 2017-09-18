//1.4.8 Write a program to determine the number pairs of values 
//in an input file that are equal. If your first try is quadratic, 
//think again and use Arrays.sort() to develop a linearithmic solution.

import edu.princeton.cs.algs4.In;
import java.util.Arrays;

public class Ex_1_4_8 {

  public static void main(String[] args) {
    int[] a = In.readInts(args[0]);
    int count = 0;
    int previous = a[0];
    Arrays.sort(a);
    
    for(int i = 1; i < a.length; i++) {
      int current = a[i];
      if (current == previous) {
        System.out.println(current);
        count++;
      }
      
      previous = current;
    }
    System.out.println(count);
  }
}
