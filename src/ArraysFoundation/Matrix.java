package ArraysFoundation;

import java.util.Arrays;

public class Matrix {

  public static void main(String[] args) {
    int n = 4;

    int[][] ar = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) {
          ar[i][j] = 1;
        } else if (i < j ) {
          ar[i][j] = 2;
        } else {
          ar[i][j] = 0;
        }
      }
    }
    System.out.println(Arrays.deepToString(ar));
    int a = 0;
  }

}
