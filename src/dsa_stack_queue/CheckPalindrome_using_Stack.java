package dsa_stack_queue;

import java.util.Stack;

public class CheckPalindrome_using_Stack {
    static void main(String[] args) {
        String str1="abccba";
        String str2="abcdcba";
        String str3="abccbba";
        String str4="abcdacba";

        System.out.println(checkpalindromestring(str1));
        System.out.println(checkpalindromestring(str2));
        System.out.println(checkpalindromestring(str3));
        System.out.println(checkpalindromestring(str4));
    }

    private static boolean checkpalindromestring(String str) {
        Stack<Character> st=new Stack<>();
        int size=str.length();
        if(size%2==0)
        {
            for(int i=0;i<size/2;i++)
            {
                st.push(str.charAt(i));
            }
            for(int i=size/2;i<size;i++)
            {
                if(str.charAt(i)!=st.pop())
                {
                    return false;
                }
            }
        }
        else{
            for(int i=0;i<size/2;i++)
            {
                st.push(str.charAt(i));
            }
            for(int i=(size/2)+1;i<size;i++)
            {
                if(str.charAt(i)!=st.pop())
                {
                    return false;
                }
            }
        }
    return true;
    }
}
