import java.util.Scanner;

public class FindDuplicateElements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
    boolean isVisited = false;

      for (int j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
          isVisited = true;
          break;
        }
      }
      if (isVisited) {
        continue;
      }

      int count = 0;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }

      if (count > 0) {
        System.out.println(arr[i]);

      }
    }
  }
}
