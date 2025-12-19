class Solution {
public:
    bool halvesAreAlike(string s) {
        int n = s.length();
        int count = 0;

        for(int i = 0; i < n/2; i++){

            if(isVowel(s[i])) count++;

            if(isVowel(s[i + n/2])) count --;

        }
    return count == 0;
    }

    bool isVowel(char c){
         
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }

    return false;
    }
};