import java.util.Scanner;

public class FirstDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int digit = num % 10;
    while(num != 0) {
      digit = num % 10;
      num /= 10;
    }
    System.out.println(digit);
  }
}
