//A string s is a circular rotation of a string t if it 
//matches when the characters are circularly shifted by
//any number of positions; 
//
//e.g., ACTGACG is a circular shift of
//TGACGAC, and vice versa. Detecting this condition is 
//important in the study of genomic sequences. 
//
//Write a program that checks whether two given strings s 
//and t are circular shifts of one another. 
//
//Hint : The solution is a one-liner with indexOf(), length(), and
//string concatenation.

public class Ex_1_2_6 {
  public static void main(String[] args) {
    if (args[0].length() == args[1].length()) {
      String full = args[0] + args[0];
      
      if (full.indexOf(args[1]) != -1) {
        System.out.println(true);
      }
    }
  }
}
