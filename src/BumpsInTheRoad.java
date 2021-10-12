public class BumpsInTheRoad {

  public static String bumps(final String road) {
    char[] ar = road.toCharArray();

    int number = 0;

    for (char c:ar) {
      if (c == 'n') {
        number++;
      }
    }

    if (number >= 15) {
      return "Car Dead";
    } else {
      return "Woohoo!";
    }
  }

  public static void main(String[] args) {
    System.out.println(bumps("__n__n______nn__nn_nnn"));
  }

}
