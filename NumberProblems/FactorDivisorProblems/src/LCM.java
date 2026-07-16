import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int min = num1 < num2 ? num1 : num2;
    int gcd = 1;

    for (int i = 2; i <= min; i++) {
      if (num1 % i == 0 && num2 % i == 0) {
        gcd = i;
      }
    }
    int lcm = (num1 * num2) / gcd;
    System.out.println(lcm);
    //gcd * lcm = n1 * n2
  }
}
