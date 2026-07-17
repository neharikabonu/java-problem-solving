import java.util.Scanner;

public class AverageOfElements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();
    int[] arr = new int[size];

    int sum = 0;
    for (int i = 0; i < size; i++) {
      sum += sc.nextInt();
    }

    double avg =(double) sum / size;

    System.out.println(avg);
  }
}
