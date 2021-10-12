public class SmallestDif {

  public static int smallestDif(int[] numbers) {

    Integer result = null;

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if (result == null && i != j
            || i != j && numbers[i] > numbers[j] && numbers[i] - numbers[j] < result) {
          result = numbers[i] - numbers[j];
        }

      }

    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(smallestDif(new int[]{3, 1, 34, 55}));
  }
}
