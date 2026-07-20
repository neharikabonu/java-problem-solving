import java.util.Scanner;

public class FindSecondLargestElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    //input
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(findSecondLargestElement(arr));
  }

  public static int findSecondLargestElement(int[] arr) {

    int max = arr[0];
    int secondMax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      } else if (arr[i] > secondMax && arr[i] != max) {
        secondMax = arr[i];
      }
    }

    return secondMax;
  }
}
