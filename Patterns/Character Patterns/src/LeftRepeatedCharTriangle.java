public class LeftRepeatedCharTriangle {
  public static void main(String[] args) {
    for (char ch = 'A'; ch <= 'E'; ch++) {
      for (char ch1 = 'A'; ch1 <= ch; ch1++) {
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}
/*
A
BB
CCC
DDDD
EEEEE
 */