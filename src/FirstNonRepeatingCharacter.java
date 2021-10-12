public class FirstNonRepeatingCharacter {

  private static char firstNonRepeatingCharacter(String s) {

    StringBuilder sb = new StringBuilder(s);


    for (int i = 0; i < sb.length(); i++) {
      char c = sb.charAt(i);

      if (!new StringBuilder(s).deleteCharAt(i).toString().contains(String.valueOf(c))) {
        return c;
      }
    }
    return '-';
  }

  public static void main(String[] args) {
    System.out.println(firstNonRepeatingCharacter("aaabcccddeeeff"));
  }

}
