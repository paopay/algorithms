//1.3.1 Add a method isFull() to FixedCapacityStackOfStrings.

public class FixedCapacityStackOfStrings {
  private String[] a; // stack entries
  private int N; // size

  public FixedCapacityStackOfStrings(int cap) {
    a = new String[cap];
  }

  public boolean isFull() {
    return N == (a.length - 1);
  }
  
  public boolean isEmpty() {
    return N == 0;
  }

  public int size() {
    return N; 
  }

  public void push(String item) {
    a[N++] = item;
  }

  public String pop() {
    return a[--N]; 
  }
  
  public static void main(String[] args) {
    FixedCapacityStackOfStrings s;
    s = new FixedCapacityStackOfStrings(1);
    
    s.push("one");
    System.out.println(s.isFull());
  }
}