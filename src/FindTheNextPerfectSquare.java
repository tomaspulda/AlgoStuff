public class FindTheNextPerfectSquare {

  public static long findNextSquare(long sq) {
    double square = Math.sqrt(sq);

    if (square % 1 != 0) {
      return -1L;
    } else {
      square++;
      return (long) (square * square);
    }
  }

  public static void main(String[] args) {
    System.out.println(findNextSquare(114));
  }
}
