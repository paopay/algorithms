//1.4.34 Hot or cold. Your goal is to guess a secret integer between 
//1 and N. You repeatedly guess integers between 1 and N. After each 
//guess you learn if your guess equals the secret integer (and the 
//game stops). Otherwise, you learn if the guess is hotter (closer to)
//or colder (farther from) the secret number than your previous guess. 
//Design an algorithm that finds the secret number in at most ~2 lg N 
//guesses. Then design an algorithm that finds the secret number in
//at most ~ 1 lg N guesses.

import java.util.Scanner;
import java.util.Random;

public class HotOrCold {
  
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner keyboard = new Scanner(System.in);
    int N = Integer.parseInt(args[0]);
    int number = rand.nextInt(N);
    int lastGuess = 0;
    int currentGuess = 0;
    int count = 0;
    int lastGuessDiff = 0;
    int currentGuessDiff = 0;
    System.out.println(number);
    while (lastGuess != number) {
      System.out.println("enter an integer");
      currentGuess = keyboard.nextInt();
      
      if (count == 0) {
        count++;
        lastGuess = currentGuess;
        continue;
      }
      
      lastGuessDiff = Math.abs(lastGuess - number);
      currentGuessDiff = Math.abs(currentGuess - number);
      
      if (currentGuessDiff > lastGuessDiff) {
        System.out.println("Colder");
      } else if (currentGuessDiff < lastGuessDiff) {
        System.out.println("Hotter");
      } else {
        System.out.println("Neither Hotter nor Colder");
      }
      
      lastGuess = currentGuess;
      count++;
    }
    
    System.out.println("You got it!");
  }

}
