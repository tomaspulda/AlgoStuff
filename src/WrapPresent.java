import java.util.Arrays;
import java.util.stream.IntStream;

public class WrapPresent {

  public static int wrap(int height, int width, int length){
    int[] ar = {height, width, length};
    IntStream sortedStream = Arrays.stream(ar).sorted();
    int[] sortedAr = sortedStream.toArray();

    int result = 0;
    result += sortedAr[0]*4;
    result += (sortedAr[1]+sortedAr[2])*2;
    result += 20;
    return result;
  }

  public static void main(String[] args) {
    System.out.println(wrap(17, 32, 11));
  }

}
