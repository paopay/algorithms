import edu.princeton.cs.algs4.Stack;

//1.3.4 Write a stack client Parentheses that reads in a text 
//stream from standard input and uses a stack to determine 
//whether its parentheses are properly balanced. For example,
//your program should print true for [()]{}{[()()]()} 
//and false for [(]).
                                                                   
public class Parentheses {
  private static final char[] LEFT = new char[] {'{', '[', '('};
  
  public boolean isBalanced(String s) {
    Stack<Character> stack = new Stack<Character>();
    
    
    for(int i=0; i < s.length(); i++) {
      char current = s.charAt(i);
      
      if (current == '{'
          || current == '['
          || current == '(') {
        stack.push(current);
      }
      
      if (current == '}'
          || current == ']'
          || current == ')') {
        if (stack.isEmpty()) return false; 
      }
      
      if (current == '}') {
        if (stack.pop() != '{') return false;
      }
      
      if (current == ')') {
        if (stack.pop() != '(') return false;
      }
     
      if (current == ']') {
        if (stack.pop() != '[') return false;
      }
    }
    
    return true;
  }
  
  public static void main(String[] args) {    
    Parentheses parens = new Parentheses();
    System.out.println(parens.isBalanced("[()]{}{[()()]()}"));
    System.out.println(parens.isBalanced("[(])")); 
  }

}
