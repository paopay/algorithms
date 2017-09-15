//1.3.44 Text editor buffer. Develop a data type for a buffer
//in a text editor that implements the following API:
//
//public class Buffer
//
//Buffer() create an empty buffer
//void insert(char c) insert c at the cursor position
//char delete() delete and return the character at the cursor
//void left(int k) move the cursor k positions to the left
//void right(int k) move the cursor k positions to the right
//int size() number of characters in the buffer
//
//Hint : Use two stacks.

import edu.princeton.cs.algs4.Stack;

public class Buffer {
  int N;
  int cursor;
  Stack<Character> leftSide;
  Stack<Character> rightSide;
  
  public Buffer() {
    leftSide = new Stack<Character>();
    rightSide = new Stack<Character>();
    N = 0;
  }
  
  public void insert(char c) {
    
  }
  
  public void left(int k) {
    
  }
  
  public void right(int k) {
    
  }
  
  public int size() {
    return leftSide.size() + rightSide.size();
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
