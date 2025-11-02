class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 0, h = num;
        while (l <= h) {
            long m = (l + h) / 2;
            long square = m * m;  

            if (square == num) {
                return true;
            } else if (square > num) {
                h = (int)(m - 1);
            } else {
                l = (int)(m + 1);
            }
        }
        return false;
    }
}