import java.util.Scanner;

public class PrintLeftToRight {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rev = 0;

    while (num != 0) {
      rev = rev * 10 + (num % 10);
      num /= 10;
    }

    while (rev != 0) {
      System.out.println(rev % 10);
      rev /= 10;
    }
  }
}
