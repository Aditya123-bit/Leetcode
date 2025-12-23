class Solution {
public:
    int furthestDistanceFromOrigin(string moves) {
        int pos = 0;
        int blank = 0;

        for(char c : moves){
            if(c == 'L') pos--;
            else if(c == 'R') pos++;
            else blank++;
        }

        return blank + abs(pos);
    }
};