class Solution {
public:
    bool halvesAreAlike(string s) {
        int n = s.length();
        string half;
        string otherhalf;

        for(int i = 0; i < n/2; i++){
            char ch = s[i];
            half += ch;
        }

        for(int i = n/2; i < n; i++){
            char ch = s[i];
            otherhalf += ch;
        }
        int count = countVowel(half);
        int count2 = countVowel(otherhalf);
        if(count == count2) return true;
    return false;    
    }
    int countVowel(string s){
        int count = 0;

    for (char c : s) {
        c = tolower(c);   
        if (c == 'a' || c == 'e' || c == 'i' || 
            c == 'o' || c == 'u') {
            count++;
        }
    }
    return count;
    }
};