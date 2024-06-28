/**
 * 
 */
package medium;

/**
 * @author sanji
 *
 */
public class PatternSearchUsingKMP_12 {

	public static void main(String[] args) {
		String text = "aabaaba";
        String pattern = "aba";
        int m=pattern.length();
        String s1 = pattern+"$"+text;
        int LPS[] = new int[s1.length()];
        LPS = constructLPSArray(s1);
        
        for(int i=0;i<LPS.length;i++){
        	if(LPS[i]==pattern.length()){
        		System.out.println("Starting index:"+(i-m-1-m)+1);
        	}
        }
        
	}

	private static int[] constructLPSArray(String s1) {

        int lpsArr[]= new int[s1.length()];
        lpsArr[0]=0;
		for(int i=1;i<s1.length();i++){
			int x = lpsArr[i-1];
			while(s1.charAt(i)!=s1.charAt(x)){
				if(x==0){
					x=-1;
					break;				
				}
				x = lpsArr[x - 1];
			}
			lpsArr[i]=x+1;
		}
		return lpsArr;
		
		
	
	}

}
