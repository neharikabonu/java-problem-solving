public class PascalTriangle {
  public static void main(String[] args) {
    int n = 5;

    for (int i = 0; i < n; i++) {
      int value = 1;

      for (int j = 0; j <= i; j++) {
        System.out.print(value + " ");

        value = value * (i - j) / (j + 1);
      }

      System.out.println();
    }

  }
}

/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
 */