import java.util.Scanner;

public class GCD_Optimized {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    while(num2 != 0) {
      int rem = num1 % num2;
      num1 = num2;
      num2 = rem;
    }

    System.out.println(num1);
  }
}
