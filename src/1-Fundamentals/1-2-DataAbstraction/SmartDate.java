
public class SmartDate {
  private final int month;
  private final int day;
  private final int year;
  
  public SmartDate(int m, int d, int y) {
    month = m;
    day   = d;
    year  = y;
  }
  
  public int month() {
    return month;
  }
  
  public int day() {
    return day;
  }
  
  public int year() {
    return year;
  }
  
  public String toString() {
    return month() + "/" + day() + "/" + year();
  }
  
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    int d = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);

    SmartDate date = new SmartDate(m, d, y);
    System.out.println(date);
  }

}
