// https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.Arrays;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
   
    	int[] aArr =new int[50];
    	
    	for(int i=0;i<a.length();i++) {
    		aArr[i]= a.toLowerCase().charAt(i);	
    	}
    		
       int[] bArr =new int[50];
    	
    	for(int i=0;i<b.length();i++) {
    		bArr[i]= b.toLowerCase().charAt(i);	
    	}
    	
    	  Arrays.sort(aArr);
    	  Arrays.sort(bArr);
    	  
    	  if(Arrays.equals(aArr, bArr)) {
    		  return true;
    	  } else {
    		  return false;
    	  }
    }

    public static void main(String[] args) {
    	 java.util.Scanner scan = new java.util.Scanner(System.in);
         String a = scan.next();
         String b = scan.next();
         scan.close();
         boolean ret = isAnagram(a, b);
         System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    }
