import java.util.Arrays;

public class SubInt {

  public static int[] subInt(int number, int[] ar) {

    Integer integer = number;
    String string = Arrays.toString(ar);
    String[] strings = string.split(" ");

    StringBuilder result = new StringBuilder();
    String[] arResult = result.toString().split(" ");


    for (int i = 0; i < strings.length; i++) {
      if (strings[i].contains(integer.toString())) {
        result.append(i).append(" ");

      }
    }
    int[] arr = new int[arResult.length];

    for (int i = 0; i < strings.length; i++) {
      arr[i] = Integer.parseInt(arResult[i]);
    }
    return arr;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(subInt(1, new int[] {1, 11, 34, 52, 61})));

  }
}
