public class Algo2 {

  public static boolean solution(String str, String ending) {
    return str.endsWith(ending);
  }

  public static String accum(String s) {
    char[] chars = s.toCharArray();
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < chars.length; i++) {
      result.append(chars[i]).toString().toUpperCase();
      for (int j = 0; j < i; j++) {
        result.append(chars[i]).toString();
      }
      result.append('-');
    }

    String js = "asdf";

    return result.substring(0, result.length() - 1);
  }

  public static void main(String[] args) {
    System.out.println(accum("abc"));
  }

}
