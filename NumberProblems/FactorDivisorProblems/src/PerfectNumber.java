//sum of factors = num
//1+2+3 = 6

import java.util.Scanner;

public class PerfectNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (num <= 1) {
      System.out.println("Ordinary Number");
      return;
    }
    int sum = 1;

    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        sum += i;

        if (i != num /i) {
          sum += num/i;
        }
      }
    }
    System.out.println(sum);
    if (sum == num) {
      System.out.println("Perfect Number");
    } else {
      System.out.println("Ordinary Number");
    }
  }
}
