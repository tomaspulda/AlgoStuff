public class VowelCount {

  public static int getCount(String str) {
    int vowelsCount = 0;
    char[] ar = str.toCharArray();

    for (char c:ar) {
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        vowelsCount++;
      }
    }
    return vowelsCount;
  }

  public static void main(String[] args) {
    System.out.println(getCount("asdůfkljweweai"));
  }
}
