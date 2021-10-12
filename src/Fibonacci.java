public class Fibonacci {

  public static long fib (int n) {
    boolean isNegativ = false;
    if (n<0) {
      n*=-1;
      isNegativ = true;
    }

    long previousNumber = 0;
    long nextNumber = 1;
    for (int i = 0; i < n-1; i++) {
      long sum = previousNumber+nextNumber;
      previousNumber = nextNumber;
      nextNumber = sum;
    }
    if (isNegativ) {
      nextNumber*=-1;
    }
    return nextNumber;
  }

  public static void main(String[] args) {
    System.out.println(fib(10));
  }


}
