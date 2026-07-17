import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int[] copy = new int[arr.length]; //size
    for (int i = 0; i < arr.length; i++) {
      copy[i] = arr[i];
    }

    System.out.println(Arrays.toString(copy));
  }
}
