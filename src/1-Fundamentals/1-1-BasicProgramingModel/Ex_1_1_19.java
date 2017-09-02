//What is the largest value of N for which this program
//takes less 1 hour to compute the value of F(N)? Develop
//a better implementation of F(N) that saves computed values
//in an array.

public class Ex_1_1_19 {

  public static long F(int N) {
    if (N == 0) return 0;
    if (N == 1) return 1;
    return F(N-1) + F(N-2);
  }
  
  public static long BetterF(int N) {
    if (N == 0) return 0;
    if (N == 1) return 1;
    
    long[] numbers = new long[N];
    numbers[0] = 0;
    numbers[1] = 1;
    
    for (int i = 2; i <= N-1; i++) {
      numbers[i] = numbers[i-1] + numbers[i-2];
    }
    return numbers[N-1];
  }
  
	public static void main(String[] args) {
		for (int N = 0; N < 5; N++) {
		  System.out.println(N + " " + BetterF(N));
		}
	}
}
