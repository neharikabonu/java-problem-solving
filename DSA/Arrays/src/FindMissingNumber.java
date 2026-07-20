import java.util.Scanner;

public class FindMissingNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    //input
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(findMissingNumber(arr));

  }

  public static int findMissingNumber(int[] arr) {
    int n = arr.length + 1;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    int num = (n * (n + 1)) / 2 - sum;
    return num;
  }
}
