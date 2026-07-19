import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[index++] = arr[i];
      }
    }

    for (int i = index; i < arr.length; i++) {
      arr[i] = 0;
    }

    System.out.println(Arrays.toString(arr));
  }
}
