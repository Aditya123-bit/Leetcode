class Solution {
    public int[] getSneakyNumbers(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();

     for (int x : nums) {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }
    List<Integer> ls = new ArrayList<>();

    for (int key : map.keySet()) {
        if (map.get(key) == 2) {
            ls.add(key);
        }
    }

     int[] result = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            result[i] = ls.get(i);  
        }

    return result; 
    }
}