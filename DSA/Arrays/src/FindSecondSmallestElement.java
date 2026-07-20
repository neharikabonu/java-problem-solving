import java.util.Scanner;

public class FindSecondSmallestElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    //input
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int ans = findSecondSmallestElement(arr);
    if (ans == Integer.MAX_VALUE) {
      System.out.println("No second max element");
      return;
    }
    System.out.println(ans);
  }

  public static int findSecondSmallestElement(int[] arr) {
    int min = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        secondMin = min;
        min = arr[i];
      } else if(arr[i] < secondMin && arr[i] != min) {
        secondMin = arr[i];
      }
    }
    return secondMin;
  }
}
