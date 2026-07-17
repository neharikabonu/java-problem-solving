import java.util.Scanner;

public class SecondLargestElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int i = 0; i < size; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      } else if (arr[i] > secondMax && arr[i] != max) {
        secondMax = arr[i];
      }
    }

    System.out.println(secondMax);

//    int max = arr[0];
//    for (int i = 0; i < size; i++) {
//      if (arr[i] > max) {
//        max = arr[i];
//      }
//    }
//
//    int secondMax = Integer.MIN_VALUE;
//    for (int i = 0; i < size; i++) {
//      if (arr[i] < max && arr[i] > secondMax) {
//        secondMax = arr[i];
//      }
//    }
//    System.out.println(secondMax);
  }
}
