//1.3.32 Steque. A stack-ended queue or steque is a data type 
//that supports push, pop, and enqueue. Articulate an API 
//for this ADT. Develop a linked-list-based implementation.

public class Steque<Item> {
  private Node first, last;
  
  private class Node {
    Item item;
    Node next;
  }
  
  public Steque() {
    first = last = null;
  }
  
  public void enqueue(Item item) {
    Node oldLast = last;
    last = new Node();
    last.item = item;
    last.next = null;
    
    if (isEmpty()) {
      first = last;
    } else {
      oldLast.next = last; 
    }
  }
  
  public void push(Item item) {
    Node oldFirst = first;
    first = new Node();
    first.item = item;
    first.next = oldFirst;
    
    if (last == null) {
      last = first;
    }
  }
  
  public boolean isEmpty() {
    return first == null || last == null;
  }
  
  public Item pop() {
    Item item = first.item;
    first = first.next;
    return item;
  }
  
  public static void main(String[] args) {
    Steque<Integer> steque = new Steque<Integer>();
    steque.enqueue(1);
    System.out.println(steque.first.item);
    System.out.println(steque.isEmpty());
    
    steque.pop();
    System.out.println(steque.isEmpty());
    
    steque.enqueue(2);
    steque.enqueue(3);
    System.out.println(steque.first.next.item);
    
    steque.push(1);
    System.out.println(steque.first.item);
    System.out.println(steque.first.next.item);
    
    System.out.println(steque.pop());
  }
}
