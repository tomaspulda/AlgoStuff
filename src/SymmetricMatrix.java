public class SymmetricMatrix {

  public static boolean isSymmetric(int[][] ar) {

    for (int i = 0; i < ar.length; i++) {
      for (int j = 0; j < ar.length; j++) {
        if (ar[i][j] != ar[j][i]) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isSymmetric(new int[][]{{5, 0, 1}, {0, 2, 2}, {1, 2, 5}}));
  }

}
