import java.util.Scanner;

public class LeadersInAnArray {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    //input
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    leadersInAnArray(arr);
  }

  public static void leadersInAnArray(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      boolean leader = true;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] <= arr[j]) {
          leader = false;
          break;
        }
      }
      if(leader) {
        System.out.println(arr[i]);
      }
    }
      System.out.println(arr[arr.length - 1]);
  }
}
