package test;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		String text = "geeksforgeeks";
		String pattern = "frog";
		int n = text.length();
		int m=pattern.length();
		
		for(int i=0;i<=n-m;i++){
			String s1= text.substring(i, m+i);
			boolean is =checkAnagram(s1,pattern);
			if(is){
				System.out.println(i);
			}
		}
		
	}

	private static boolean checkAnagram(String s1, String s2) {

        if(s1.length()!=s2.length()){
       	 return false;
        }
        int freq[] = new int [256];
        for(int i=0;i<s1.length();i++){
       	 freq[s1.charAt(i)]++;
       	 freq[s2.charAt(i)]--;
        }
        for(int i=0;i<freq.length;i++){
       	 if(freq[i]!=0){
       		 return false;
       	 }
        }

		return true;
	
	}

	

	
	

	

	

}
