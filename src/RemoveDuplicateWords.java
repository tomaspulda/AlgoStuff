public class RemoveDuplicateWords {

  public static String removeDuplicateWords(String s){
    String[] ar = s.split(" ");
    StringBuilder sb = new StringBuilder();

    for (String string:ar) {
      if (!sb.toString().contains(string)) {
        sb.append(string).append(" ");
      }
    }
    return sb.toString().trim();
  }

  public static void main(String[] args) {
    System.out.println(removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
  }

}
