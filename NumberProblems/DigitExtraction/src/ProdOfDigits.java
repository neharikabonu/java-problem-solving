import java.util.Scanner;

public class ProdOfDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int prod = 1;

    while (num != 0) {
      prod *= (num % 10);
      num /= 10;
    }
    System.out.println(prod);
  }
}
