/**
 * 
 */
package difficult;

/**
 * @author sanjit
 *
 */
public class TowerOfHonai_10 {


	public static void main(String[] args) {

	     int n=3;
	     towerOfHonai(n,"A","B","C");
	     
		}

		private static void towerOfHonai(int n, String A, String B, String C) {
			
			if(n==1){
				System.out.println("Move" + A +"->"+C);
				return;
			}
			
			towerOfHonai(n-1, A, C, B);
			towerOfHonai(1,   A, B, C);
			towerOfHonai(n-1, B, A, C);
			
		}
}
