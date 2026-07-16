import java.util.Scanner;

public class IsArmstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int temp = num;
    int num1 = 0;

    while (num != 0) {
      int digit = num % 10;
      num1 += digit * digit * digit;
      num /= 10;
    }
    if(temp == num1) {
      System.out.println("Armstrong");
    } else {
      System.out.println("Ordinary");
    }
  }
}
