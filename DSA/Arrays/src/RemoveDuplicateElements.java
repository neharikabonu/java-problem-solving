import java.util.Scanner;

public class RemoveDuplicateElements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    //solution
    for (int i = 0; i < arr.length; i++) {
      boolean isVisited = false;
      for (int j = 0; j < i; j++) {
        if (arr[i] == arr[j]) {
          isVisited = true;
          break;
        }
      }
      if (!isVisited) {
        System.out.print(arr[i] +" ");
      }
    }
  }
}
