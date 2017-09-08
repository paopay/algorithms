//Instrument BinarySearch to use a Counter to count the total number of 
//keys examined during all searches and then print the total after all searches
//are complete.
//Hint: Create a Counter in main() and pass it as an argument to rank().

import edu.princeton.cs.algs4.Counter;

public class Ex_1_2_9 {
  public static int rank(int key, int[] a, Counter counter) {
    
    int lo = 0;
    int hi = a.length - 1;
    
    while (lo <= hi) {
      counter.increment();
      
      int mid = lo + (hi - lo) / 2;
      
      if (key < a[mid]) hi = mid - 1;
      else if (key > a[mid]) lo = mid + 1;
      else return mid;
      }
    return -1;
  }
  
  public static void main(String[] args) {
    Counter counter1 = new Counter("numbers examined");
    Counter counter2 = new Counter("numbers examined");
    int[] arr = {1,2,3,4,5,6,7};
    
    rank(4, arr, counter1);
    System.out.println(counter1);
    
    rank(1, arr, counter2);
    System.out.println(counter2);
  }
}
