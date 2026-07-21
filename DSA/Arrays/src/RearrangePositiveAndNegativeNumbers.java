import java.util.Arrays;
import java.util.Scanner;

public class RearrangePositiveAndNegativeNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    rearrangePositiveAndNegativeNumbers(arr);

    System.out.println(Arrays.toString(arr));
  }

  public static void rearrangePositiveAndNegativeNumbers(int[] arr) {
    int[] pos = new int[arr.length];
    int[] neg = new int[arr.length];

    int indexPos = 0;
    int indexNeg = 0;

    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > 0) {
        pos[indexPos++] = arr[i];
      } else {
        neg[indexNeg++] = arr[i];
      }
    }

    int i = 0;
    int j = 0;
    int k = 0;
    while (i < indexPos && j < indexNeg) {
      arr[k++] = pos[i++];
      arr[k++] = neg[j++];
    }

    while(i < indexPos) {
      arr[k++] = pos[i++];
    }

    while (j < indexNeg) {
      arr[k++] = neg[j++];
    }
  }
}
