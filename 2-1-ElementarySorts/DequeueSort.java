import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.In;

public class DequeueSort {
  private Queue<Integer> deck = new Queue<Integer>();
  private int deckSize = 52;
  
  public DequeueSort(int[] a) {
    for(int i = 0; i < a.length; i++) {
      deck.enqueue(a[i]);
    }
  }
  
  public boolean isSorted() {
    for(int i = 0; i < deckSize; i++) {
      int a = deck.dequeue();
    }
    return true;
  }
  
  public void sort() {
    int top1;
    int top2;
    int ordered = 0;
    int num = 0;
    
    while(ordered < 52) {
      num++;
      top1 = deck.dequeue();
      top2 = deck.peek();
      
      for(int i = 0; i < deckSize; i++) {
        // Put last card remaining in the back.
        if(i == deckSize - 1) {
          deck.enqueue(top1);
          
          if(ordered == 51) { 
            ordered++;
          } else { 
            ordered = 0;
          }
          
          continue;
        }
        
        // Compare top and second top
        if(top1 > top2) {
          // Put the second card at the bottom
          // Peek at the next card
          top2 = deck.dequeue();
          deck.enqueue(top2);
          top2 = deck.peek();
        } else {
          // Put top card at the bottom and get new top card
          // Peek at the second card
          deck.enqueue(top1);
          top1 = deck.dequeue();
          top2 = deck.peek();
          ordered++;
        }
      }
    } 
    System.out.println(num);
  }
  
  public void show() {
    // Print the array, on a single line.
    for (int i = 0; i < deckSize; i++) {
      System.out.print(deck.dequeue() + " ");
    }
    
    System.out.println();
  }
  
  
  public static void main(String[] args) {
    int[] a = In.readInts(args[0]);
    DequeueSort deck = new DequeueSort(a);
    deck.sort();
    deck.show();
  }
}
