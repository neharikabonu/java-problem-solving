import java.util.Scanner;

public class SmallestDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int smallest = num % 10;

    while (num != 0) {
      int digit = num % 10;
      if (digit < smallest) {
        smallest = digit;
      }
      num /= 10;
    }
    System.out.println(smallest);
  }
}
