class Solution {
    public int gcdOfOddEvenSums(int n) {
    //     int sumOdd = 0;
    //     int sumEven = 0;

    //     for(int i = 1; i <= 2*n; i++){
    //         if(i % 2 == 0){
    //             sumEven += i;
    //         }else sumOdd += i;
    //     }

    //     return gcd(sumOdd, sumEven);
    // }
    // public static int gcd(int a, int b){
    //     while(a > 0 && b >0){
    //         if(a > b){
    //             a %= b;
    //         }else b %= a;
    //     }
    //     if(a == 0) return b;
    //     return a;
            int sumOdd = n * n;
        int sumEven = n * (n + 1);
        return gcd(sumOdd, sumEven);
    }
     private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}