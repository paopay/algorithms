//2.1.11 Implement a version of shellsort that keeps the increment 
//sequence in an array, rather than computing it.

import edu.princeton.cs.algs4.In;

public class Ex_2_1_11 {

  public static void sort(Comparable[] a) {
    int N   = a.length;
    int[] h = new int[N/3];
    
    for(int i = 0; i < h.length; i++) {
      if(i == 0) { 
        h[i] = 1;
        continue;
      }
      
      h[i] = 3 * h[i-1] + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
    }
    
    
    for(int k = h.length - 1; k >= 0; k--) { // h-sort the array.
      for (int i = h[k]; i < N; i++) { 
        // Insert a[i] among a[i-h], a[i-2*h], a[i-3*h]... .
        for (int j = i; j >= h[k] && less(a[j], a[j-h[k]]); j -= h[k]) {
          exch(a, j, j-h[k]);
        }
      }
    } 
  }
  
  private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
  }
  
  private static void exch(Comparable[] a, int i, int j) {
    Comparable t = a[i]; a[i] = a[j]; a[j] = t; 
  }
  
  private static void show(Comparable[] a) { 
    // Print the array, on a single line.
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    
    System.out.println();
  }
  
  public static boolean isSorted(Comparable[] a) { 
    // Test whether the array entries are in order.
    for (int i = 1; i < a.length; i++) {
      if (less(a[i], a[i-1])) return false;
    }
      
    return true;
  }

  public static void main(String[] args) { 
    // Read strings from standard input, sort them, and print.
    String[] a = In.readStrings(args[0]);
    sort(a);
    assert isSorted(a);
    show(a);
  }
}
