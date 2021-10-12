public class TrickyAverage {

  public static double getTrickyAvg(int[] numbers) {
    double min = numbers[0];
    double max = numbers[0];

    for (int i : numbers) {
      if (i > max) {
        max = i;
      }
      if (i < min) {
        min = i;
      }
    }
    return (min + max) / 2;
  }

  public static void main(String[] args) {
    System.out.println(getTrickyAvg(new int[]{3, 4, 5, 6}));
  }

}
