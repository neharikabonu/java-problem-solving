import java.util.Scanner;

public class Arm1toN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

      for (int i = 1; i <= num; i++ ) {
        int temp = i;
        int count = 0;
        while(temp != 0) {
          count++;
          temp /= 10;
        }
        temp = i;
        int res = 0;
        while (temp != 0) {
          int power = 1;
          int digit = temp % 10;
          for (int j = 1; j <= count; j++) {
            power = power * digit;
          }
          temp /= 10;
          res += power;
        }
        if (res == i) {
          System.out.println(res);
        }
      }
    }
  }
