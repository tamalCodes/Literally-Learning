// https://leetcode.com/problems/reverse-string/description

public class ReverseString{
    public void swap(char[] s, int left, int right){
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }

    public void reverseString(char[] s) {
        int n = s.length, x = 0;
        x = n/2 - 1;
            

        for(int i=0; i<=x; i++){
            swap(s,i,n-1-i);
        }
    }
}