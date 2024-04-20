/*
LPS: Longest Prefix which is also suffix
prefix: substring starts at 0 index and ends at any index except n-1
suffix: substring starts at any index and ends at n-1 index

Need to construct LPS of all characters in a given string 
Ex: aabaaba
LPS[] = {0,1,0,1,2,3,4}

   a              aa           aab           aaba           aabaa           aabaab    
pre suf       pre   suff    pref  suff    pre    suff     pref   suff     pref   suff
    a         a     a        a     b      a       a       a      a         a     b
                    aa       aa    ab     aa      ba      aa     aa        aa    ab
                                   aab    aab     aba     aab    baa       aab   aab
                                                  aaba    aaba   abaa      aaba  baab
                                                                 aabaa     aabaa abaab
                                                                                 aabaab

So, we if see the prefix and suffix calculated find LPS for each index it comes out to be
LPS[] = {0,1,0,1,2,3,4}

Now LPS array calculation

LPS of ith index:
Lets say x = LPS[i-1]
if(str[i]==str[x]
then LPS[i] =x+1;
else
x = LPS[x-1]
and again check 
if(str[i] ==str[x]
then LPS[i] = x+1
 */
package medium;

import java.util.Arrays;

/**
 * @author sanjit
 *
 */
public class ConstructLPSArray_11 {

	public static void main(String[] args) {
		String s1 = "aba$aabaaba";
		int lpsArr[] = constructLpsArray(s1);
		System.out.println(Arrays.toString(lpsArr));
		
	}

	private static int[] constructLpsArray(String s1) {
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

