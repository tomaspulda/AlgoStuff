import java.util.ArrayList;
import java.util.List;

public class Rotations {


  public static boolean containAllRots(String strng, List<String> arr) {
    char[] ar = strng.toCharArray();
    char[] newAr = new char[ar.length];

    int index = newAr.length - 1;

    for (int i = 0; i < ar.length; i++) {
      newAr[i] = ar[index];
      index--;
    }

    String newString = new String(newAr);

    return arr.contains(newString);
  }

  public static void main(String[] args) {

    System.out.println(containAllRots("dha", new ArrayList<>(List.of("ahd", "asd"))));
  }

}
