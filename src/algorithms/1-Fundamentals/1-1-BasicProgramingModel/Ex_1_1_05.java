

//Write a code fragment that prints true if the double
//variables x and y are both strictly between 0 
//and 1 and false otherwise.

public class Ex_1_1_05 {
  public static void main(String[] args) {
    int f = 0;
    int g = 1;
    for (int i = 0; i <= 15; i++)
    {
      System.out.println(f);
      f = f + g;
      g = f - g;
    }
  }
}