import java.util.Arrays;
import java.util.Scanner;

public class UnionOfTwoSortedArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//    System.out.println("Array size:");
    int size = sc.nextInt();

    int[] arr1 = new int[size];

//    System.out.println("Array elements: ");
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = sc.nextInt();
    }

//    System.out.println("Array size:");
    int size1 = sc.nextInt();

    int[] arr2 = new int[size1];

//    System.out.println("Array elements: ");
    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = sc.nextInt();
    }

    int[] result = unionOfTwoSortedArrays(arr1, arr2);

    System.out.println(Arrays.toString(result));
  }

  public static int[] unionOfTwoSortedArrays(int[] arr1, int[] arr2) {
    int[] arr = new int[arr1.length + arr2.length];

    int i = 0, j = 0, k = 0;

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        if (k == 0 || arr1[i] != arr[k-1]) {
          arr[k++] = arr1[i++];
        } else {
          i++;
        }
      } else if (arr1[i] > arr2[j]) {
        if (k == 0 || arr2[j] != arr[k-1]) {
          arr[k++] = arr2[j++];
        } else {
          j++;
        }
      } else {
        if (k == 0 || arr1[i] != arr[k-1]) {
          arr[k++] = arr1[i++];
          j++;
        } else {
          i++;
          j++;
        }
      }
    }

    while (i < arr1.length) {
      if (k == 0 || arr1[i] != arr[k]) {
        arr[k++] = arr1[i++];
      } else {
        i++;
      }
    }

    while (j < arr2.length) {
      if (k == 0 || arr2[j] != arr[k]) {
        arr[k++] = arr2[j++];
      } else {
        j++;
      }
    }

    int[] result = new int[k];
    for (int idx = 0; idx < k; idx++) {
      result[idx] = arr[idx];
    }
    return result;
  }

}
