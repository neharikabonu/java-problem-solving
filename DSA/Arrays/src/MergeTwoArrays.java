import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    System.out.println("arr1 size");
    int size = sc.nextInt();
    int[] arr1 = new int[size];
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = sc.nextInt();
    }

//    System.out.println("arr2 size");
    int size2 = sc.nextInt();
    int[] arr2 = new int[size2];
    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = sc.nextInt();
    }

    int[] result = mergeTwoArrays(arr1, arr2);
    System.out.println(Arrays.toString(result));
  }

  public static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
    int[] arr = new int[arr1.length + arr2.length];

    int index = 0;
    for (int i = 0; i < arr1.length; i++) {
      arr[index++] = arr1[i];
    }

    for (int i = 0; i < arr2.length; i++) {
      arr[index++] = arr2[i];
    }
    return arr;
  }
}
