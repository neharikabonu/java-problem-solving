public class RightTriangle {
  public static void main(String[] args) {
    int n = 5;

    for (int i = 1; i <= n; i++) {

      //spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}

/*
    1
   12
  123
 1234
12345
 */
