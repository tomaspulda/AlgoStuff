public class Repeater {

  public static String repeat(String string,long n){
    StringBuilder sb = new StringBuilder(string);

    for (int i = 0; i < n-1; i++) {
      sb.append(string);
    }
    return sb.toString();
  }

  public static String repeat2(String string, long n) {
    return string.repeat((int) n);
  }

  public static void main(String[] args) {
    System.out.println(repeat("a", 5));
    System.out.println(repeat2("a", 5));
  }
}
