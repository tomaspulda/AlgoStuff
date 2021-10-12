public class HelloMatrix {

  public static String hello(char[][] matrix) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (i % 2 == 0 && j % 2 == 0) {
          sb.append(matrix[i][j]);
        } else if (i % 2 != 0 && j % 2 != 0) {
          sb.append(matrix[i][j]);
        }
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    char[][] ar = {{'h', 'p', 'e'}, {'k', 'l', 'a'}, {'l', 'm', 'o'}};
    System.out.println(hello(ar));
  }

}
