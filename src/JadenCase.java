public class JadenCase {

  public static String toUpperCase(String str){

       char[] ar = str.toCharArray();

    for (int i = 0; i < ar.length; i++) {
      if (i == 0 || ar[i - 1] == ' ') {
        ar[i] = Character.toUpperCase(ar[i]);
      }
    }
    return new String(ar);
  }


  public static void main(String[] args) {

    System.out.println(toUpperCase("ahoj jak se mas?"));
  }
}