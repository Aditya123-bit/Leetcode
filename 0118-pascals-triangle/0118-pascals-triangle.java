class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int n = 0; n < numRows; n++) {
            List<Integer> row = new ArrayList<>();
            int val = 1; 
            row.add(val);

            for (int r = 1; r <= n; r++) {
                val = val * (n - r + 1) / r; 
                row.add(val);
            }

            result.add(row);
        }

        return result;
    }
}
