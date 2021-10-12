public class RotationOfStringFromStati {

  public static boolean isRotation(String a, String b) {
    char[] ar = a.toCharArray();
    char[] newAr = new char[ar.length];

    int index = ar.length - 1;

    for (int i = 0; i < ar.length; i++) {
      newAr[i] = ar[index];
      index--;
    }

    String result = new String(newAr);

    return result.equals(b);
  }

  public static boolean isRotation2(String a, String b) {
    StringBuilder sb = new StringBuilder(a);
    sb.reverse();
    a = sb.toString();

    return a.equals(b);
  }

  public static void main(String[] args) {
    System.out.println(isRotation("asder", "redsa"));
    System.out.println(isRotation2("asder", "redsa"));
  }


}
