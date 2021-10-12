public class ReverseWords {

  public static String reverseWords(String original) {

    int len = original.length();
    StringBuilder spaces = new StringBuilder();
    for (int i = 0; i < len; i++) {
      spaces.append(" ");
    }

    if (spaces.toString().equals(original)) {
      return spaces.toString();
    }

    String[] words = original.split(" ");

    StringBuilder result = new StringBuilder();

    for (String word : words) {
      StringBuilder sb = new StringBuilder(word);
      sb.reverse();
      sb.append(" ");
      result.append(sb);
    }
    return result.toString().trim();
  }

  public static void main(String[] args) {
    System.out.println(reverseWords("This is and example!"));
    System.out.println(reverseWords("double  spaces"));
    System.out.println(reverseWords("1     2"));
  }

}
