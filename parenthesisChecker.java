/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t-- > 0){
    		String str = scn.next();
    		
    		if(bb(str)){
    		    System.out.println("balanced");
    		}if(!bb(str)){
    		    System.out.println("not balanced");
    		}
		}
	}
	
	public static boolean bb(String str){
	    Stack<Character> st = new Stack<>();
	    for(int i=0;i<str.length();i++){
	        char ch = str.charAt(i);
	        if(ch == '('||ch == '{'||ch == '['){
	            st.push(ch);
	        }else if(ch == ')'){
	            if(st.size()==0||st.peek()!='('){
	                return false;
	            }else{
	                st.pop();
	            }
	        }
	        else if(ch == '}'){
	            if(st.size()==0||st.peek()!='{'){
	                return false;
	            }else{
	                st.pop();
	            }
	        }
	        else if(ch == ']'){
	            if(st.size()==0||st.peek()!='['){
	                return false;
	            }else{
	                st.pop();
	            }
	        }
	    }
	    if(st.size()>0){
	        return false;
	    }
	    return true;
	}
}