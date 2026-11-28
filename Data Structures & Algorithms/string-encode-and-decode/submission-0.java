class Solution {

    public String encode(List<String> strs) {
        StringBuffer ans = new StringBuffer();
        strs.forEach(s -> {
            Integer n = s.length();
            ans.append(Integer.toString(n) + "-");
            ans.append(s);
        });
        return ans.toString();
    }

    public List<String> decode(String str) {
        int n = str.length();
        List<String> ans = new ArrayList<>();
        int prev = 0;
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) == '-'){
                Integer m = Integer.parseInt(str.substring(prev, i));
                prev += m + 1 + (i - prev);
                ans.add(str.substring(i + 1, prev));
                i = prev - 1;
            }
        }
        return ans;
    }
}
