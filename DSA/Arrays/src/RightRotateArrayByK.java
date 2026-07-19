import java.util.Arrays;
import java.util.Scanner;

public class RightRotateArrayByK {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("enter k:");
    int k = sc.nextInt();
    int n = arr.length;

    k = k % n;

    if (k == 0) {
      System.out.println(Arrays.toString(arr));
      return;
    }

    //Step 1. Reverse the entire array

    reverse(arr, 0, n - 1);

    //Step 2. Reverse the remaining elements from first = k

    reverse(arr, k, n - 1);

    //Step 3. Reverse the first k elements

    reverse(arr,0, k-1);
    System.out.println(Arrays.toString(arr));
  }

  public static void reverse(int[] arr, int first, int last) {
    while (first < last) {
      int temp = arr[first];
      arr[first] = arr[last];
      arr[last] = temp;
      first++;
      last--;
    }
  }
}
