/*
     *
    ***
   *****
  *******
 *********
 */

public class Pyramid {
  public static void main(String[] args) {
    int n = 5;

    for (int i = 1; i <= n; i++) {
      //spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


/*
n = 5;
i=1; 1s 2*1-1 = 1
  2; 3s 2*2-1 = 3
  3; 5s
  4; 7s
  5; 9s
 */