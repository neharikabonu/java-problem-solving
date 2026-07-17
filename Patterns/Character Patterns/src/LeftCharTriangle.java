public class LeftCharTriangle {
  public static void main(String[] args) {
    int n = 5;
    for (char ch = 'A'; ch <= 'E'; ch++) {
      for (char ch1 = 'A'; ch1 <= ch; ch1++) {
        System.out.print(ch1);
      }
      System.out.println();
    }
  }
}

/*
A
AB
ABC
ABCD
ABCDE
 */