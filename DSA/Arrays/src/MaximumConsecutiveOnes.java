import java.util.Scanner;

public class MaximumConsecutiveOnes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    //input
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(maximumConsecutiveOnes(arr));
  }

  public static int maximumConsecutiveOnes(int[] arr) {
    int count = 0;
    int maxCount = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        count++;
        if (maxCount < count) {
          maxCount = count;
        }
      } else {
        count = 0;
      }
    }
    return maxCount;
  }
}
