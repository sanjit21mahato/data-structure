/**
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

     3
   2   1
 1  0 0 -1
0 -1    
 */
package conceptCoding;

/**
 * @author sanjit
 *
 */
public class ClimbingStairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n =5;
		int noOfWaysToClimbStairs = findNumberOfWaysToClimbStairs(n);
		System.out.println(noOfWaysToClimbStairs);

	}

	private static int findNumberOfWaysToClimbStairs(int n) {
		int arr[]= new int[n+1];
		return findNumberOfWaysToClimbStairs(n,arr);
	}

	private static int findNumberOfWaysToClimbStairs(int n, int arr[]) {
         if(n==0){
        	 return 1;
         }
         else if(n==-1){
        	 return 0;
         }
         else {
          if(arr[n]==0){	 
              int m= findNumberOfWaysToClimbStairs(n-1, arr)+findNumberOfWaysToClimbStairs(n-2,arr);
              arr[n]=m;
              return m;
          }else{
        	  return arr[n];
          }
         }
	}

}
