import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int min = num1 < num2 ? num1 : num2;
    int gcd = 1;

    for (int i = min; i >= 2; i--) {
      if (num1 % i == 0 && num2 % i == 0) {
        gcd = i;
        break;
      }
    }
    System.out.println(gcd);
  }
}
