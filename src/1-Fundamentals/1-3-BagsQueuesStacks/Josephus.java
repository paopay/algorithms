//1.3.37 Josephus problem. In the Josephus problem from antiquity,
//N people are in dire straits and agree to the following strategy
//to reduce the population. They arrange themselves in a circle 
//(at positions numbered from 0 to N–1) and proceed around the circle,
//eliminating every Mth person until only one person is left. Legend
//has it that Josephus figured out where to sit to avoid being 
//eliminated. Write a Queue client Josephus that takes N and M from 
//the command line and prints out the order in which people are
//eliminated (and thus would show Josephus where to sit in the circle).

//   % java Josephus 7 2
//   1 3 5 0 4 2 6

import edu.princeton.cs.algs4.Queue;

public class Josephus {
  
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int m = Integer.parseInt(args[1]);
    
    Queue<Integer> people = new Queue<Integer>();
    
    // queue people in order
    for (int i = 0; i < n; i++) {
      people.enqueue(i);
    }
    
    int count = 0;
    String finalOrder = "";
    
    while (people.size() > 0) {
      int temp = people.dequeue();
      
      if (++count % m == 0) {
        finalOrder = finalOrder + temp + " ";
      } else {
        people.enqueue(temp);
      }
    }
    
    System.out.println(finalOrder);
  }

}
