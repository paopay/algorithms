//1.3.35 Random queue. A random queue stores a collection of items.
//
//Write a class RandomQueue that implements this API. 
//Hint : Use an array representation (with resizing). 
//To remove an item, swap one at a random position 
//(indexed 0 through N-1) with the one at the last 
//position (index N-1). Then delete and return the 
//last object, as in ResizingArrayStack. Write a client
//that deals bridge hands (13 cards each) using RandomQueue<Card>.

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class RandomQueue<Item> {
  
  private int N;
  private Item[] items;
  private ThreadLocalRandom randomizer;
  
  private void resize(int max) {
    Item[] temp = (Item[]) new Object[max];
    
    for (int i = 0; i < N; i++) {
      temp[i] = items[i];
    }
    items = temp;
  }

  public RandomQueue() {
    items = (Item[]) new Object[1];
    N = 0;
  }
  
  public boolean isEmpty() {
    return N == 0;
  }
  
  public int size() {
    return N;
  }
  
  public void enqueue(Item item) {
    if (N == items.length) {
      resize(N*2);
    }
    
    items[N++] = item;
  }
  
  public Item dequeue() { //remove and return a random item
    int index;
    
    if (N == 1) {
      index = 0;
    } else {
      index = ThreadLocalRandom.current().nextInt(0, N-1);
    }
    
    Item item = items[index];
    items[index] = items[N-1]; // Replace value at index with last in queue
    items[--N] = null;
    
    if (N > 0 && N == items.length/4) {
      resize(items.length/2);
    }
    
    return item;
  }
  
  public Item sample() { //return a random item without removing
    int index;
    
    if (N == 1) {
      index = 0;
    } else {
      index = ThreadLocalRandom.current().nextInt(0, N-1);
    }
    
    return items[index];
  }
  
  public static void main(String[] args) {
    RandomQueue<Integer> deck = new RandomQueue<Integer>();
    for (int i = 1; i <= 52; i++) {
      deck.enqueue(i);
    }
    System.out.println(deck.sample());
    System.out.println(deck.size()); 
    
    int[] player1 = new int[13];
    int[] player2 = new int[13];
    int[] player3 = new int[13];
    int[] player4 = new int[13];
    
    for (int i = 0; i < 13; i++) {
      player1[i] = deck.dequeue();
      player2[i] = deck.dequeue();
      player3[i] = deck.dequeue();
      player4[i] = deck.dequeue();
    }
    
    System.out.println("player 1's cards " + Arrays.toString(player1));
    System.out.println("player 2's cards " + Arrays.toString(player2));
    System.out.println("player 3's cards " + Arrays.toString(player3));
    System.out.println("player 4's cards " + Arrays.toString(player4));
    
    System.out.println(deck.size());
  }
}
