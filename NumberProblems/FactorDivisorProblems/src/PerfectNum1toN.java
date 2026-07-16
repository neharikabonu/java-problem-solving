import java.util.Scanner;

public class PerfectNum1toN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    //perfect number logic
    for (int i = 1; i <= num; i++) {
      int sum = 1;
      for (int j = 2; j * j <= i; j++) {
        if (i % j == 0) {
          sum += j;

          if (j != i / j) {
            sum += i / j;
          }
        }
      }
      if (sum == i) {
        System.out.println(i);
      }
    }
  }
}
