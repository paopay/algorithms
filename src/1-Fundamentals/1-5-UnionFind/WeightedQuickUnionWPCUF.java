import edu.princeton.cs.algs4.StdIn;

public class WeightedQuickUnionWPCUF {
  private int[] id;    // parent link
  private int[] size;  // size of component
  private int count;
  
  public WeightedQuickUnionWPCUF(int N) {
    count = N;
    id    = new int[N];
    size  = new int[N];
    
    for(int i = 0; i < N; i++) {
      id[i] = i;
      size[i] = 1;
    }
  }
  
  public int count() {
    return count;
  }
  
  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }
  
  private int root(int i) {
    // if not its own root, look at parent
    while(i != id[i]) {
      // make node point to its grandparent (Path Compression)
      id[i] = id[id[i]];
      i = id[i];
    }
    return i;
  }
  
  public void union(int p, int q) {
    int i = root(p);
    int j = root(q);
    
    if(i == j) return; // if same root, nothing to do
    
    // smaller component gets pointed to bigger one
    // increase size of bigger component by smaller one
    if(size[i] < size[j]) {
      id[i] = j;
      size[j] += size[i]; 
    } else {
      id[j] = i;
      size[i] += size[j];
    }
    
    count--;
  }
  
  public static void main(String[] args) {
    int N = StdIn.readInt(); // Read number of sites.
    System.out.println(N);
    WeightedQuickUnionWPCUF uf = new WeightedQuickUnionWPCUF(N); // Initialize N components.
    
    while (!StdIn.isEmpty()) {
      int p = StdIn.readInt();
      int q = StdIn.readInt(); // Read pair to connect.
      if (uf.connected(p, q)) continue; // Ignore if connected.
      uf.union(p, q); // Combine components
      System.out.println(p + " " + q); // and print connection.
    }
    
    System.out.println(N - uf.count() + " components");
  }

}
