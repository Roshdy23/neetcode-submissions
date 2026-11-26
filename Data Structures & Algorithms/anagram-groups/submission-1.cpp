class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<string, vector<int>> mp;

        int it = 0;
        for(auto &str : strs) {
            string temp = str;
            sort(temp.begin() , temp.end());
            mp[temp].push_back(it++);
        }

        vector<vector<string>> ans;

        for(auto &p :mp) {
            vector<string> indices;
            for(int &ind : p.second) {
                indices.push_back(strs[ind]);
            }
            ans.push_back(indices);
        }
        return ans;
    }
};
