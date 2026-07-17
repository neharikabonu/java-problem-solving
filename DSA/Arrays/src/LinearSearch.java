import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int target = sc.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        System.out.println("Element found at index " + i);
        return;
      }
    }
    System.out.println("Element not found");
  }
}
