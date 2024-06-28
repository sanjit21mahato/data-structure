/**
 Print fibbonaci series of a number
 */
package external.easy;

/**
 * @author sanji
 *
 */
public class FibbonacciSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

     int n=5;
     //1st way
     int counter=2;
     int pre =0;
     int current =1;
     System.out.println(0);
     System.out.println(1);
     if(n>1){
      printFibonacciSequence(n,counter, current,pre); 
     }
	
     
     //2nd way
    /* for(int i=0;i<=n;i++){
       int fib= fibonnaciSequnece(i);
       System.out.println(fib);
     }*/
     
	}

	private static int fibonnaciSequnece(int n) {

       if(n<=1) return n;
       return fibonnaciSequnece(n-1)+fibonnaciSequnece(n-2);
		
		
	}

	private static void printFibonacciSequence(int n, int counter, int current, int pre) {
        if(counter>n){
        	return;
        }else{
        	System.out.println(current+pre);
            printFibonacciSequence(n, counter+1, current+pre, current);
        }
		
	}

	

}
