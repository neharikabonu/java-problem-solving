import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    //input
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int idx = removeDuplicatesFromSortedArray(arr);
    for (int i = 0; i < idx; i++) {
      System.out.print(arr[i]+" ");
    }

  }

  public static int removeDuplicatesFromSortedArray(int[] arr) {
    int index = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[index]) {
        index++;
        arr[index] = arr[i];
      }
    }
    return index + 1;
  }
}
