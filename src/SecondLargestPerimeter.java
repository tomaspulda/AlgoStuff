import java.util.Arrays;
import java.util.stream.IntStream;

public class SecondLargestPerimeter {

  public static int secondLargestPerimeter(int[][] matrix) {
    if (!Arrays.deepEquals(matrix, new int[][]{})) {

      int[] ar = new int[matrix.length];

      int index = 0;

      for (int[] triangle : matrix) {
        for (int number : triangle) {
          ar[index] += number;
        }
        index++;
      }
      IntStream newAr = Arrays.stream(ar).sorted();
      int[] newArSorted = newAr.toArray();
      int secondLargest = newArSorted[newArSorted.length - 2];

      for (int i = 0; i < ar.length; i++) {
        if (ar[i] == secondLargest) {
          return i;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(
        secondLargestPerimeter(new int[][]{{2, 3, 4}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}));
    System.out.println(secondLargestPerimeter(new int[][]{{2, 3, 4}, {4, 5, 6}}));
    System.out.println(secondLargestPerimeter(new int[][]{}));
  }

}
