import java.util.Scanner;

public class MaxOfTwoNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int rev1 = 0;
    int rev2 = 0;

    while (num1 != 0 && num2 != 0) {
      int digit1 = num1 % 10;
      int digit2 = num2 % 10;
      rev1 = rev1 * 10 + digit1;
      rev2 = rev2 * 10 + digit2;

      num1 /= 10;
      num2 /= 10;
    }

    int result = rev1 > rev2 ? rev1 : rev2;
    System.out.println(result);
  }
}
