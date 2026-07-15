import java.util.Scanner;

public class SameDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean isSame = true;
    int lastDigit = num % 10;
    while (num != 0) {
      int digit = num % 10;
      if (lastDigit != digit) {
        isSame = false;
        break;
      }
      num /= 10;
    }

    if(isSame) {
      System.out.println("Same");
    } else System.out.println("Not same");
  }
}
