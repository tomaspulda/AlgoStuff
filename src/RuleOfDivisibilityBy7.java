public class RuleOfDivisibilityBy7 {

  public static long[] seven(long m) {
    int n = 0;
    while (m > 99) {
      m = (m / 10) - (m % 10) * 2;
      n++;
    }
    return new long[]{m, n};
  }

  public static void main(String[] args) {
    for (long l:seven(1603)) {
      System.out.println(l);
    }
  }
}
