import java.util.ArrayList;
import java.util.List;

public class Rotations2 {

  public static boolean containAllRots(String strng, List<String> arr) {
    char[] ar = strng.toCharArray();
    char[] newAr = new char[ar.length];

    for (int x = 0; x < ar.length; x++) {

      for (int i = 0; i < ar.length; i++) {
        if (i == ar.length - 1) {
          newAr[0] = ar[i];
        } else if (i != ar.length - 1) {
          newAr[i + 1] = ar[i];
        }
      }
      String string = new String(newAr);
      if (!arr.contains(string)) {
        return false;
      }
      ar = newAr;
      newAr = new char[ar.length];

    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(containAllRots("ahoj",
        new ArrayList<>(List.of("ahoj", "jaho", "ojah", "hoja", "asdlkfj"))));
  }
}
