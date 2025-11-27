class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        for(int i = 1; i <= 2*n; i++){
            if(i % 2 == 0){
                sumEven += i;
            }else sumOdd += i;
        }

        return gcd(sumOdd, sumEven);
    }
    public static int gcd(int a, int b){
        while(a > 0 && b >0){
            if(a > b){
                a %= b;
            }else b %= a;
        }
        if(a == 0) return b;
        return a;
    }
}