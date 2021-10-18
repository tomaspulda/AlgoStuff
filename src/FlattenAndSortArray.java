import java.util.Arrays;
import java.util.stream.IntStream;

public class FlattenAndSortArray {

  public static int[] flattenAndSort(int[][] array) {
    if (array.length == 0 ) {
      return new int[]{};
    }

    StringBuilder sb = new StringBuilder();

    for (int[] i : array) {
      for (int n : i) {
        sb.append(n).append(" ");
      }
    }

    String[] charAr = sb.toString().trim().split(" ");
    int[] ar = new int[charAr.length];

    for (int i = 0; i < ar.length; i++) {
      ar[i] = Integer.parseInt(charAr[i]);
    }

    IntStream resultAr = Arrays.stream(ar).sorted();

    return resultAr.toArray();
  }

  public static void main(String[] args) {
    for (int i :flattenAndSort(new int[][]{{3, 2, 1}, {4, 6, 5}, {}, {9, 7, 8}})) {
      System.out.println(i);

    }

   /* for (int i :flattenAndSort(new int[][]{})) {
      System.out.println(i);
    }*/
  }

}
