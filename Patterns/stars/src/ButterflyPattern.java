public class ButterflyPattern {
  public static void main(String[] args) {
    int n = 5;

    //upper-part
    for (int i = 1; i <= n; i++) {
      //stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      //space
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      //stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    //lower-part
    for (int i = n - 1; i >= 1; i--) {
      //stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      //space
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      //stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

/*
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 */