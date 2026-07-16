import java.util.Scanner;

public class PrintFactors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i = 1; i * i <= num; i++) {
      if (num % i == 0) {
        System.out.println(i);

        if (i != num / i) {
          System.out.println(num / i);
        }
      }
    }
  }
}
