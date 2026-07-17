import java.util.Scanner;

public class CountPositiveNegativeZero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    int positive = 0;
    int negative = 0;
    int zero = 0;

    for (int i = 0; i < size; i++) {
      int num = sc.nextInt();
      if (num > 0) {
        positive++;
      } else if (num < 0) {
        negative++;
      } else {
        zero++;
      }
    }

    System.out.println("Positive Count: " +positive);
    System.out.println("Negative Count: " +negative);
    System.out.println("Zero Count: " +zero);

  }
}
