public class StringPrefixAndSuffix {

  static int solve(String s) {
    for (int i = s.length() / 2; i > 0; i--) {
      if (s.substring(0, i).equals(s.substring(s.length() - i))) {
        return i;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(solve("ahojfewfioahoj"));
  }

}
