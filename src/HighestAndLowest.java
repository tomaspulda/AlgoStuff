public class HighestAndLowest {


  public static String highAndLow(String numbers) {

    String[] strNum = numbers.split(" ");
    Integer[] num = new Integer[strNum.length];

    for (int i = 0; i < num.length; i++) {
      num[i] = Integer.parseInt(strNum[i]);
    }

    Integer min = num[0];
    Integer max = num[0];

    for (Integer i : num) {
      if (i < min) {
        min = i;
      }
    }

    for (Integer i : num) {
      if (i > max) {
        max = i;
      }
    }

    return new String(min + ", " + max);
  }


  public static void main(String[] args) {
    System.out.println(highAndLow("-1 5 8 9"));
  }

}
