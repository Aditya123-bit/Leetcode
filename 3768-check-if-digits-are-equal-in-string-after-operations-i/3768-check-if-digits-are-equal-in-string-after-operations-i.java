class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);

        while (n > 2) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < n - 1; i++) {
                int sum = (sb.charAt(i) - '0' + sb.charAt(i + 1) - '0') % 10;
                temp.append((char) (sum + '0'));
            }
            sb = temp;
            n--;
        }

        return sb.charAt(0) == sb.charAt(1);
    }
}
