class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>(); 

        for (int num : arr) {
             if (map.containsKey(num)) {
             map.put(num, map.get(num) + 1);
            } else {
             map.put(num, 1);
            }
        }

        Set<Integer> occurrences = new HashSet<>(map.values());
        
        return map.size() == occurrences.size();
    }
}