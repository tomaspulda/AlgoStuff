public class FixString {

  public static String fixString(String string) {
    StringBuilder sb = new StringBuilder(string);

    StringBuilder sbNew = new StringBuilder();

    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) != 'a' || sb.charAt(i) != 'e' || sb.charAt(i) != 'i' || sb.charAt(i) != 'o' || sb.charAt(i) != 'u' ) {
        sbNew.append(sb.charAt(i));
      } else {
        if (sb.charAt(i) != sb.charAt(i++)) {
          sbNew.append(i);
        }
      }
    }
    return sbNew.toString();
  }

  public static void main(String[] args) {
    System.out.println(fixString("heellooo"));
    System.out.println(fixString("hiiiiiiiii"));
    System.out.println("");

  }

}
