//1.4.12 Write a program that, given two sorted arrays of N int values,
//prints all elements that appear in both arrays, in sorted order. The 
//running time of your program should be proportional to N in the worst 
//case.

public class Ex_1_4_12 {

  public static void main(String[] args) {
    int[] x = {1, 3, 4, 5, 5, 10, 32, 54, 59, 90};
    int[] y = {5, 9, 30, 54, 93, 223, 454, 2021, 9999};
    
    int i = 0;
    int j = 0;
    
    while (i < x.length && j < y.length) {
      if (x[i] == y[j]) {
        System.out.println(x[i]);
        i++;
        j++;
      } else if (x[i] > y[j]) {
        j++;
      } else if (x[i] < y[j]) { 
        i++;
      }
    }
  }
}
