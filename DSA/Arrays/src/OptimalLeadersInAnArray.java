import java.util.Scanner;

public class OptimalLeadersInAnArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for(int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    optimalLeadersInAnArray(arr);
  }

  public static void optimalLeadersInAnArray(int[] arr) {
    int largest = Integer.MIN_VALUE;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] > largest) {
        largest = arr[i];
        System.out.println(largest);
      }
    }
  }
}
