public class Switcheroo {

  public static String switcheroo(String x) {
    String y = x.replaceAll("a", "%");
    String z = y.replaceAll("b", "a");
    return z.replaceAll("%", "b");
  }

  public static void main(String[] args) {
    System.out.println(switcheroo("aabacbaa"));
  }
}
