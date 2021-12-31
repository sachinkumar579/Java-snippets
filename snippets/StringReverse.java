// https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
       
        boolean flag = true;
        for(int i=0;i<str.length();i++) {
        	if(!(str.charAt(i)==str.charAt(str.length()-1-i))) {
        		flag = false;
        	}
        	
        }
        if(flag)
        System.out.println("Yes");
        else {
        	System.out.println("No");
        }
        sc.close();
        
    }
}


