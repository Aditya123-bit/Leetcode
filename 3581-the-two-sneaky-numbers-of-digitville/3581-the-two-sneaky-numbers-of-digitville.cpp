class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        unordered_map<int, int> freq;

        for (int x : nums) {
            freq[x]++;
        }

        vector<int> result;

        for (auto &p : freq) {
            if (p.second == 2) {
                result.push_back(p.first);
            }
        }

        return result;
    }
};