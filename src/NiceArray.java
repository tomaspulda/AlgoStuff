public class NiceArray {

  public static boolean isNice(Integer[] arr) {

    boolean is = false;

    for (Integer i : arr) {
      for (Integer n : arr) {

        Integer a = i - 1;
        Integer b = i + 1;

        if (n.equals(a) || n.equals(b)) {
          is = true;
          break;
        }
      }
      is = false;
    }

    return is;
  }

  public static void main(String[] args) {
    System.out.println(isNice(new Integer[]{2, 10, 9, 3}));
  }

}
