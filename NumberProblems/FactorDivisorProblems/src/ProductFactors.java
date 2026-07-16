import java.util.Scanner;

public class ProductFactors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    long prod = 1;

    for (int i = 1; i * i <= num; i++) {
      if(num % i == 0) {
        prod *= i;

        if (i != num / i) {
          prod *= (num/i);
        }
      }
    }
    System.out.println(prod);
  }
}
