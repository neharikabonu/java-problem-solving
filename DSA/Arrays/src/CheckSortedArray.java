import java.util.Scanner;

public class CheckSortedArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    boolean isSorted = true;

    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i+1]) {
        isSorted = false;
        break;
      }
    }

    if (isSorted) {
      System.out.println("Sorted");
    } else {
      System.out.println("Not Sorted");
    }
  }
}
