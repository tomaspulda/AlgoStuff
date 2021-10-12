public class StringGame {

  public static String haveFun(String str) {
    StringBuilder sb = new StringBuilder(str);
    System.out.println(sb);

    sb.append(" :)");
    System.out.println(sb);

    sb.insert(4, " Tomáši,");
    System.out.println(sb);

    System.out.println(sb.toString().replaceAll("Tomáši", "Lucko"));

    sb.delete(0, 5);
    System.out.println(sb);

    sb.setCharAt(21, '(');
    System.out.println(sb);

    sb.reverse();
    System.out.println(sb);

    return sb.toString();
  }

  public static void main(String[] args) {
    haveFun("Ahoj jak se máš?");
  }
}
