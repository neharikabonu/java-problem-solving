import java.util.Scanner;

public class SecondLargestt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int largest = -1;
    int secondLargest = -1;

    while(num != 0) {
      int digit = num % 10;
      if (digit > largest ) {
        secondLargest = largest;
        largest = digit;
      } else if (digit < largest && digit > secondLargest) {
        secondLargest = digit;
      }
      num /= 10;
    }
    System.out.println("Largest:" +largest);
    System.out.println("Second Largest: " +secondLargest);
  }
}
