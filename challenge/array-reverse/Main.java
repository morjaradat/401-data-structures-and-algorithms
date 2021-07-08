import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(arrayReverse(array)));
  }

  public static int[] arrayReverse(int[] array) {
    int[] revArr = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      int j = array.length - 1 - i;
      int y = array[j];
      revArr[i] = y;
    }
    return revArr;
  }
}
