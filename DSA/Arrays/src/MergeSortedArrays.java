import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
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

    int[] result = mergeSortedArrays(arr1, arr2);
    System.out.println(Arrays.toString(result));
  }

  public static int[] mergeSortedArrays (int[] arr1, int[] arr2) {
    int[] arr = new int[arr1.length + arr2.length];

    int i = 0, j = 0, k = 0;

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        arr[k] = arr1[i];
        k++;
        i++;
      } else if (arr1[i] > arr2[j]) {
        arr[k] = arr2[j];
        k++;
        j++;
      } else {
        arr[k++] = arr1[i++];
        arr[k++] = arr2[j++];
      }
    }

    while (i < arr1.length) {
      arr[k++] = arr1[i++];
    }

    while (j < arr2.length) {
      arr[k++] = arr2[j++];
    }
    return arr;
  }
 }
