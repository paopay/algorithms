//Write a code fragment that puts the binary representation 
//of a positive integer N into a String s.

public class Ex_1_1_09 {
  public static void main(String[] args) {
    int N = 322;
    System.out.println(Integer.toBinaryString(N));
    
    String s = "";
    for (int n = N; n > 0; n /= 2) {
      s = (n % 2) + s;      
    }
    
    System.out.println(s);
  }
}

