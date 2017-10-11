//1.5.7 Develop classes QuickUnionUF and QuickFindUF that implement
//quick-union and quick-find, respectively.

import edu.princeton.cs.algs4.StdIn;

public class QuickFindUF {
  private int[] id;
  private int count;

  // initialize union-find data structure with
  // N objects (0 to N – 1)
  public QuickFindUF (int N) {
    count = N;
    id = new int[N];
    for(int i = 0; i < N; i++) {
      id[i] = i;
    }
  }

  // change all those that have p as root to have q root
  public void union(int p, int q) {
    int pid = find(p);
    int qid = find(q);

    if(pid == qid) return;

    for(int i = 0; i < id.length; i++) {
      if(id[i] == pid) {
        id[i] = qid;
      }
    }
    count--;
  }

  //  are p and q in the same component?
  public boolean connected(int p, int q) {
    return find(p) == find(q);
  }

  //  component identifier for p (0 to N – 1)
  public int find(int p) { 
    return id[p];
  }

  public int count() {
    return count;
  }

  public static void main(String[] args) {
    int N = StdIn.readInt(); // Read number of sites.
    System.out.println(N);
    QuickFindUF uf = new QuickFindUF(N); // Initialize N components.
    
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
