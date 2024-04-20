/**
 * 
 */
package easy;

/**
 In Memoization, we initialaize the memo array with value not possibble for result and then for each 
 number we calculate and update the array. Then instaed of calculating result for each number we 
 we check the mem array and if its value is present we use it directly.
 It is alos called top down approach, where we begin from main problem and then sub problem.
 *
 */
public class MemoizationFibonacciForNthTerm_2 {

	 static int n =5;
	 static  int mem[]=new int[n+1];
	 
	public static void main(String[] args) {
   
     for(int i=0;i<mem.length; i++){
    	 mem[i]=-1;
     }
     int fibForNthTerm = fibForNthTerm(n);
     System.out.println(fibForNthTerm);

	}

	private static int fibForNthTerm(int n) {

	 if(mem[n]==-1){	
       if(n==0||n==1){
    	  mem[n]=n;
    	  return mem[n];
       }
      int fib= fibForNthTerm(n-1)+fibForNthTerm(n-2);
      mem[n]=fib;
	 }
	return mem[n];
	}

}
