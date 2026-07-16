import java.util.Scanner;

public class SumFactors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;

    for (int i = 1; i * i <= num; i++) {
      if (num % i == 0) {
        sum += i;

        if (i != num / i) {
          sum += num / i;
        }
      }
    }
    System.out.println(sum);
  }
}
