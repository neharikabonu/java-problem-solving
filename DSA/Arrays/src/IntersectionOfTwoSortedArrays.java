import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoSortedArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Array size:");
    int size = sc.nextInt();

    int[] arr1 = new int[size];

    System.out.println("Array elements: ");
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = sc.nextInt();
    }

    System.out.println("Array size:");
    int size1 = sc.nextInt();

    int[] arr2 = new int[size1];

    System.out.println("Array elements: ");
    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = sc.nextInt();
    }

    int[] result = intersectionOfTwoSortedArrays(arr1, arr2);

    System.out.println(Arrays.toString(result));
  }

  public static int[] intersectionOfTwoSortedArrays(int[] arr1, int[] arr2) {
    int[] arr = new int[Math.min(arr1.length, arr2.length)];

    int i = 0, j = 0, k = 0;

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] == arr2[j]) {
        if (k == 0 || arr[k - 1] != arr1[i]) {
          arr[k++] = arr1[i];

        }
        j++;
        i++;
      } else if (arr1[i] < arr2[j]) {
        i++;
      } else {
        j++;
      }
    }

    int[] result = new int[k];
    for (int index = 0; index < k; index++) {
      result[index] = arr[index];
    }
    return result;
  }
}
