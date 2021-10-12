import java.util.Arrays;

public class WhichAreIn {

  public static String[] inArray(String[] array1, String[] array2) {
    StringBuilder sb = new StringBuilder();
    for (String s:array2) {
      sb.append(s).append(" ");
    }
    String string = sb.toString().trim();
    StringBuilder resultSb = new StringBuilder();
    for (String s:array1) {
      if (string.contains(s)) {
        resultSb.append(s).append(" ");
      }
    }
   return resultSb.toString().trim().split(" ");
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(inArray(new String[]{"tarp", "mice", "bull"},
        new String[]{"lively", "alive", "harp", "sharp", "armstrong"})));
  }

}
