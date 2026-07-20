import java.util.Scanner;

public class RemoveElementFromArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    //input
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

//    System.out.println("Enter target");
    int target = sc.nextInt();

    int result = removeElementFromArray(arr, target);
    for (int i = 0; i < result; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  public static int removeElementFromArray(int[] arr, int target) {
    int idx = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != target) {
        arr[idx++] = arr[i];
      }
    }
    return idx;
  }
}
