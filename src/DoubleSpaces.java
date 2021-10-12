public class DoubleSpaces {

  public static String removeWhitespaces(String str) {
    return str.replaceAll("  ", " ");
  }


  public static void main(String[] args) {
    System.out.println(removeWhitespaces("Ahoj  jak  se  mas?"));
  }

}
