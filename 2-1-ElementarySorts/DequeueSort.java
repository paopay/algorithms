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
  
  public void sort() {
    int top1;
    int top2;
    int swaps = 0;
    
    while(swaps > 0) {
      for(int i = 0; i < deckSize; i++) {
        // Put last card remaining in the back.
        if(i == deckSize - 1) {
          top1 = deck.dequeue();
          deck.enqueue(top1);
          continue;
        }
        
        // Compare top and second top
        top1 = deck.dequeue();
        top2 = deck.dequeue();
        
        if(top1 > top2) {
          swaps++;
          deck.enqueue(top2);
        } else {
          deck.enqueue(top1);
        }
        
      }
    } 
  }
  
  
  
  public static void main(String[] args) {
    int[] a = In.readInts(args[0]);
    DequeueSort deck = new DequeueSort(a);
    deck.sort();
  }
}
