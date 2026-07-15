import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (num < 0) {
      System.out.println("Not a palindrome");
      return;
    }
    int temp = num;
    int rev = 0;

    while (temp != 0) {
      rev = rev * 10 + (temp % 10);
      temp /= 10;
    }

    if(rev == num) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a palindrome");
    }
  }
}
