import java.util.Scanner;

public class OptimalMajorityElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(optimalMajorElement(arr));
  }

  public static int optimalMajorElement(int[] arr) {
    int candidate = 0;
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (count == 0) {
        candidate = arr[i];
        count = 1;
      } else if (arr[i] == candidate) {
        count++;
      } else {
        count--;
      }
    }
    int majorCount = 0;
    int n = arr.length / 2;
    for (int i = 0; i < arr.length; i++) {
      if (candidate == arr[i]) {
        majorCount++;
      }
    }

    if (majorCount > n) {
      return candidate;
    } else {
      return -1;
    }
  }
}
