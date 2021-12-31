// https://leetcode.com/problems/reverse-string/

public class ReverseAString {
    public void reverseString(char[] str) {
        for(int i=0;i<str.length/2;i++){
            char t = str[str.length-1-i];
            str[str.length-1-i]=str[i];
            str[i]=t;
        }
    }
}
