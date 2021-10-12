public class SquareOfSquares {

  public static boolean isSquare(int n) {

    if (n == 0) {
      return true;
    }

    for (int i = 2; i < n; i++) {
      if (n % i == 0 && n / i == i) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(isSquare(63001));
  }

}
