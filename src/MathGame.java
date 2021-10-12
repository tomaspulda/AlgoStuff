public class MathGame {

  public static boolean isSqueare(int n) {
    return Math.sqrt(n) % 1 == 0;
  }

  public static void main(String[] args) {
    System.out.println(isSqueare(25));
  }

}
