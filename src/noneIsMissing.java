import java.util.Arrays;
import java.util.stream.IntStream;

public class noneIsMissing {

  /*Create a function that takes a number array(inputArray) and checks
  if every number is present from 1 to the highest possible.

  Example cases:

  noneIsMissing([4,1,3,2]);
  Should return true.

  noneIsMissing([1,4,2,2]);
  Should return false

  noneIsMissing([1,6]);
  Should return false*/

  public static boolean isMissing(int[] ar) {
    IntStream arSorted = Arrays.stream(ar).sorted();
    int[] newAr = arSorted.toArray();

    int index = 1;

    for (int j : newAr) {
      if (j != index++) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isMissing(new int[]{4, 1, 3, 2}));
    System.out.println(isMissing(new int[]{1,4,2,2}));
    System.out.println(isMissing(new int[]{1,6}));
  }
}
