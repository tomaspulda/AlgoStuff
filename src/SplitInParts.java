public class SplitInParts {

  public static String splitInParts(String s, int partLength) {
    StringBuilder sb = new StringBuilder(s);

    int i = sb.length() / partLength;
    int index = partLength;
    for (int j = 1; j <= i; j++) {
      sb.insert(index, " ");
      index += partLength+1;
    }
    return sb.toString().trim();
  }

  public static void main(String[] args) {
    System.out.println(splitInParts("asůldkfjawedffoijaef", 3));
  }

}
