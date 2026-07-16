import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int temp = num;
    int temp1 = num;
    int count = 0;
    //to count the no of digits
    while(temp != 0) {
      count++;
      temp /= 10;
    }

    int result = 0;
    while (temp1 != 0) {
      int power = 1;
      int digit = temp1 % 10;
      for(int i = 1; i <= count; i++) {
        power = power * digit;
      }
      temp1 /= 10;
      result += power;
    }

    if (result == num) {
      System.out.println("Armstrong Number");
    } else {
      System.out.println("Ordinary Number");
    }

//    int n = 5;
//    int m = 3;
//    int power = 1;
//    for (int i = 1; i <= m; i++) {
//      power = power * n;
//    }
//    System.out.println(power);
  }
}
