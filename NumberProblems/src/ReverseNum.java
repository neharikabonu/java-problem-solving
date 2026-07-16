import java.util.Scanner;

public class ReverseNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String num = sc.next();
    String rev = "";

    for (int i = num.length() - 1; i >= 0; i--) {
      rev += num.charAt(i);
    }
    System.out.println(rev);
  }
}
