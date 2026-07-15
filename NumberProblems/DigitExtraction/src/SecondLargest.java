import java.util.Scanner;

public class SecondLargest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int num1 = num;
    int largest = num % 10;

    while(num != 0) {
      int digit = num % 10;
      if (digit > largest ) {
        largest = digit;
      }
      num /= 10;
    }

    int secondLargest = -1;
    while(num1 != 0) {
      int digit = num1 % 10;
      if (digit > secondLargest &&  digit < largest) {
        secondLargest = digit;
      }
      num1 /= 10;
    }
    System.out.println(secondLargest);
  }
}
