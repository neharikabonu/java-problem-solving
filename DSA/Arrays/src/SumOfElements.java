import java.util.Scanner;

public class SumOfElements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    //output
    int sum = 0;

    for (int i = 0; i < size; i++) {
      sum += sc.nextInt();
    }

//    int sum = 0;
//    for (int i = 0; i < size; i++) {
//      sum += arr[i];
//    }
    System.out.println(sum);
  }
}
