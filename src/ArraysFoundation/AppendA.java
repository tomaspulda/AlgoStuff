package ArraysFoundation;

import java.util.Arrays;

public class AppendA {

  public static String[] appendA(String[] strings) {
    for (int i = 0; i < strings.length; i++) {
      StringBuilder sb = new StringBuilder(strings[i]);
      sb.append("a");
      strings[i] = sb.toString();
    }

    return strings;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(appendA(new String[]{"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn"})));
  }

}
