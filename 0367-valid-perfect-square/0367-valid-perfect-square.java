class Solution {
    public boolean isPerfectSquare(int num) {
        int squareroot  = (int)Math.sqrt(num);
        if(squareroot * squareroot== num){
            return true;
        }else return false;
        
    }
}