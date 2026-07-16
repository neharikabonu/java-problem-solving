import java.util.Scanner;

public class Prime1toN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (num < 2) {
      return;
    }
    for (int i = 2; i <= num; i++) {
      boolean isPrime = true;
      for (int j = 2; j * j <= i; j++) {
        if(i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.println(i);
      }
    }
  }
}
