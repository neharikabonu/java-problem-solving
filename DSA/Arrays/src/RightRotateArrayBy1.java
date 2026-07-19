import java.util.Arrays;
import java.util.Scanner;

public class RightRotateArrayBy1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int last = arr[arr.length - 1];

    for (int i = arr.length-1; i > 0; i--) {
      arr[i] = arr[i-1];
    }
    arr[0] = last;
    System.out.println(Arrays.toString(arr));
  }
}
