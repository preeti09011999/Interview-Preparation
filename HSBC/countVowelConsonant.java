public class countVowelConsonant {
    public static void main(String args[]){
        String str = "geeksfor???????geeks121";
        int cons = 0;
        int vowel = 0;
        int special_char = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch=='u') vowel++;
            else if(ch >= 'b' && ch <= 'z'){
                cons++;
            }
            else if(ch == '?' || ch == '*' || ch == '!') special_char++;
        }
        System.out.println("consonant :" + cons);
        System.out.println("vowel :" + vowel);
        System.out.println("special_character :" + special_char);

    }
}
