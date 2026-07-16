import java.util.Scanner;

public class PrimeN_numbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int limit = sc.nextInt();
    int count = 0;
    int num = 2;
    while (count < limit) {
      boolean isPrime = true;
      for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        System.out.println(num);
        count++;
      }
      num++;
    }
  }
}
