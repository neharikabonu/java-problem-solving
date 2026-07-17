import java.util.Scanner;

public class FrequencyOfElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int target = sc.nextInt();
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        count++;
      }
    }

    System.out.println("Frequency : "+ count);
  }
}
