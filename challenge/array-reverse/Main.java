
public class Main {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int[] revArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int j = arr.length - 1 - i;
      int y = arr[j];
      revArr[i] = y;
    }
    System.out.println("---------");
    System.out.println(revArr[0]);
    System.out.println(revArr[1]);
    System.out.println(revArr[2]);
    System.out.println(revArr[3]);
    System.out.println(revArr[4]);
  }
}
