package dsa_stack_queue;

import java.util.Stack;

public class ReverseString_using_Stack {
    static void main(String[] args) {
        String str="abcdefgh";
        StringBuffer strrev=new StringBuffer();
        Stack<Character> st=new Stack<>();
        for(char ch:str.toCharArray())
        {
            st.push(ch);
        }
        for(int i=0;i<str.length();i++)
        {
            strrev.append(st.pop());
        }
        System.out.println(strrev);
    }
}
