import java.util.Scanner;

public class EvenOddCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int evenCount = 0;
    int oddCount = 0;

    while (num != 0) {
      int digit = num % 10;
      if (digit % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
      num /= 10;
    }
    System.out.println("Even Count: " +evenCount);
    System.out.println("Odd Count: " +oddCount);
  }
}
