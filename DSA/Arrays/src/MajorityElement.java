import java.util.Scanner;

public class MajorityElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    //input
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(majorityElement(arr));
  }

  public static int majorityElement(int[] arr) {
    int n = arr.length / 2;
    int ans = arr[0];
    for (int i = 0; i < arr.length; i++) {
      int count = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (count > n) {
        return ans;
      }
    }
    return ans;
  }

}
