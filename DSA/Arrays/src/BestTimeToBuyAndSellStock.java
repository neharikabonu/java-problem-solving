import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(bestTimeToBuyAndSellStock(arr));
  }

  public static int bestTimeToBuyAndSellStock(int[] arr) {
    int price = arr[0];
    int maxProfit = 0;

    //curr price low -> update price;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] < price) {
        price = arr[i];
      }

      int profit = arr[i] - price;

      if(profit > maxProfit) {
        maxProfit = profit;
      }
    }


    return maxProfit;
  }
}
