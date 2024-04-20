package difficult;

/*
This problem says that there are n people standing or sitting in circle.
We need to kill kth person in every iteration. After repetitive iteration, there will be 
single person left. We need to find the position of that survivor.
*/

public class JosephusProblem_11 {

	public static void main(String[] args) {

		int n=7;
		int k=3;
		int res = josephus(n,k);
		System.out.println(res);

	}

	private static int josephus(int n, int k) {
		if(n==1){
			return 0;
		}
		return (josephus(n-1, k)+k)%n ;
	}

}

