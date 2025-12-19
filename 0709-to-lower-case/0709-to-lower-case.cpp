class Solution {
public:
    string toLowerCase(string s) {
        string res;
        for(int i = 0; i < s.length(); i++){
            char ch = s[i];
            res += tolower(ch);
        }
        return res;
    }
};