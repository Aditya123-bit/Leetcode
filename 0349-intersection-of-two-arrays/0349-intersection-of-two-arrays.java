class Solution {
    public int[] intersection(int[] num1, int[] num2) {
        Arrays.sort(num1);
        Arrays.sort(num2);

        int i = 0;
        int j = 0;

        Set<Integer> st = new HashSet<>();
        
        while(i < num1.length && j < num2.length){
            if(num1[i] < num2[j]){
                i++;
            }
            else if(num2[j] < num1[i]){
                j++;
            }
            else if(num1[i] == num2[j]){
                st.add(num1[i]);
                i++;
                j++;
            }
        }

        int[] intersection = new int[st.size()];
        int idx = 0;
        for(int it : st){
            intersection[idx] = it;
            idx++;
        }
        return intersection;
    }
}