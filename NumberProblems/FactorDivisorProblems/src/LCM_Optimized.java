import java.util.Scanner;

public class LCM_Optimized {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int lcm = num1 * num2;

    while(num2 != 0) {
      int rem = num1 % num2;
      num1 = num2;
      num2 = rem;
    }
    lcm = lcm / num1;
    System.out.println(lcm);
  }
}
