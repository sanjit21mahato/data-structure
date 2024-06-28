/*
 Find square root 
 I/P: 134
 O/P: 11 
 */
package easy;

/**
 * @author sanjit
 *
 */
public class SquareRoot_24 {

	public static void main(String[] args) {
		int n = 81;
		/*int squareRoot = findSquareRootIterative(n);
		if(squareRoot==-1){
			System.out.println("No perferct square root");
		}else {
			System.out.println(squareRoot);
		}*/
		int leftIndex = 0;
		int rightIndex= n;
	    int squareRoot= findSquareRoot(n, leftIndex, rightIndex);
		if(squareRoot==-1){
			System.out.println("No perferct square root");
		}else {
			System.out.println(squareRoot);
		}
	}

	private static int findSquareRoot(int n, int leftIndex, int rightIndex) {
		
		int middle = (leftIndex+rightIndex)/2;
		
		if(leftIndex>rightIndex){
			return -1;
		}
		if(middle*middle == n)
			return middle;
		
		if(middle*middle>n)
			rightIndex = middle-1;
		else 
			leftIndex = middle+1;
		return findSquareRoot(n,leftIndex,rightIndex );
	}

	
	private static int findSquareRootIterative(int n) {
		for(int i=0;i<n/2;i++){
			if(i*i==n)return i;
			else if(i*i>n)return -1;
		}
		return -1;
	}

}
