import java.io.*;
public class mirrorCharacterString {
    public static void main(String args[]){
        String str = "pneumonia";

        String reverseAlphabet = "zyxwvutsrqponmlkjihgfedcba"; 
        int l = str.length(); 
          int n = 4;
        // The string up to the point specified in the question, 
        // the string remains unchanged and from the point up to 
        // the length of the string, we reverse the alphabetical order 
        String answer = ""; 
        for (int i = 0; i < n; i++) 
            answer = answer + str.charAt(i); 
        for (int i = n; i < l; i++) 
            answer = answer + reverseAlphabet.charAt(str.charAt(i) - 'a'); 
        System.out.println(answer); 
    }
}
