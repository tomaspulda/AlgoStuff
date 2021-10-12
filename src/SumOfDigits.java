public class SumOfDigits {

  public static int digital_root(int m) {

    while (m>9) {
      int n = m;
      m = 0;
      Integer integer = n;
      String string = String.valueOf(integer);

      for (int i = 0; i < string.length(); i++) {
        m += n % 10;
        n /= 10;
      }
    }
    return m;
  }

  public static void main(String[] args) {
    System.out.println(digital_root(132189));
  }

}
