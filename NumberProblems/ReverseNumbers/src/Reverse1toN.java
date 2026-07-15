import java.util.Scanner;

public class Reverse1toN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for (int i = 1; i <= num; i++) {
      int temp = i;
      int rev = 0;
      while (temp != 0) {
        int digit = temp % 10;
        rev = rev * 10 + digit;
        temp /= 10;
      }
      System.out.println(rev);
    }
  }
}
