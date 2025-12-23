class Solution {
public:
    int furthestDistanceFromOrigin(string moves) {
        int l = 0;
        int r = 0;
        int s = 0;

        for(int i = 0; i < moves.length(); i++){
            if(moves[i] == 'L') l++;
            else if(moves[i] == 'R') r++;
            else s++;
        }
        if(l >= r) return (l + s) - r;
        return (r + s) - l;
    }
};