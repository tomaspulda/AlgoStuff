public class CreatePhoneNumber {

  public static String createPhoneNumber(int[] numbers) {
    StringBuilder sb = new StringBuilder();
    for (int n : numbers) {
      sb.append(n);
    }
    return sb.insert(0, "(").insert(4, ")").insert(5, " ").insert(9, "-").toString();
  }

  public static void main(String[] args) {
    System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
  }
}
