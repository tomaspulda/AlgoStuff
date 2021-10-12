public class HalvingSum {

  public static int halvingSum(int n) {

    int result = n;
    int half = n;
    do {
      half /= 2;
      result += half;
    } while (half >= 1);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(halvingSum(25));
  }

}
