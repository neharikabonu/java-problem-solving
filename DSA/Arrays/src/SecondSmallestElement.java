import java.util.Scanner;

public class SecondSmallestElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int min = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;

    for (int i = 0; i < size; i++) {
      if (arr[i] < min) {
        secondMin = min;
        min = arr[i];
      } else if (arr[i] < secondMin && arr[i] != min) {
        secondMin = arr[i];
      }
    }
    System.out.println(secondMin);
  }
}
