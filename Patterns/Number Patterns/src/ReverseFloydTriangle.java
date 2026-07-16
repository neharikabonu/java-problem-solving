public class ReverseFloydTriangle {
  public static void main(String[] args) {
    int n = 4;
    int count = 0;

    for (int i = 1; i <= n; i++) {
      count += i;
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count-- +"  ");
      }
    System.out.println();
    }
  }
}

/*
10
9  8
7  6  5
4  3  2  1
 */
