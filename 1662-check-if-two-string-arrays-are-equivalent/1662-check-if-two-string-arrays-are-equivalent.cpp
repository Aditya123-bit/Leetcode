class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        string c ;
        for(string st:word1){
            c += st;
        }
        string d;
        for(string st : word2){
            d += st;
        }
        if(c == d) return true;
        return false;
    }
};