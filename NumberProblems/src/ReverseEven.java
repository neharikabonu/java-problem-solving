import java.util.Scanner;

public class ReverseEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int even = 0;
    String num1 = String.valueOf(num);
    String temp = "";

    for (int i = 0; i < num1.length(); i++) {
      int digit = Integer.parseInt(String.valueOf(num1.charAt(i)));
      if (digit % 2 == 0) {
        temp += '*';
        even = even * 10 + digit;
      } else {
        temp += digit;
      }
    }

    String result = "";
    for (int i = 0; i < temp.length(); i++) {
      if (temp.charAt(i) == '*') {
        result += even % 10;
        even /= 10;
      } else {
        result += temp.charAt(i);
      }
    }
    System.out.println(result);
  }
}
