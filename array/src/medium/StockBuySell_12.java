package medium;

/**
 * @author sanji
 *
 */

/*Each input element is price of the stock for the day and size of the array is number of days 
need to find the maximum profit that can be booked by buying and selling the stock
i/p : {1,5,3,8,12}
o/p :13

5-1 =4
12-3=9
4+9=13

O(n)

*/
public class StockBuySell_12 {

	
	public static void main(String[] args) {
	 int arr[]=	{1,5,3,8,12};
	 int maximumProfit= findMaximumProfit(arr);
     System.out.println(maximumProfit);
	}

	private static int findMaximumProfit(int[] arr) {
		int totalProfit = 0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>arr[i-1]){
				totalProfit = totalProfit+ (arr[i]-arr[i-1]);
			}
		}
		return totalProfit;
	}

}
