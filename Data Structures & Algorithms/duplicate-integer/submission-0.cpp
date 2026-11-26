class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        int n = nums.size();
        set<int>s;
        for(int i =0;i<n;i++){
            s.insert(nums[i]);
    
        }
        if(s.size()==n){
            return false;
        }
        return true;
    }
};