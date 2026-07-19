import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArrayBy1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int first = arr[0];

    int idx = 0;
    for (int i = 1; i < arr.length; i++) {
      arr[idx++] = arr[i];
    }

    arr[arr.length - 1] = first;

    System.out.println(Arrays.toString(arr));
  }
}
