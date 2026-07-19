import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToFront {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int index = arr.length - 1;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] != 0) {
        arr[index--] = arr[i];
      }
    }

    for (int i = index; i >= 0; i--) {
      arr[i] = 0;
    }

    System.out.println(Arrays.toString(arr));
  }
}
