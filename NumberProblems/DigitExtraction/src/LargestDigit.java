import java.util.Scanner;

public class LargestDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int largest = num % 10;

    while (num != 0) {
      int digit = num % 10;
      if (digit > largest) {
        largest = digit;
      }
      num /= 10;
    }
    System.out.println(largest);
  }
}
