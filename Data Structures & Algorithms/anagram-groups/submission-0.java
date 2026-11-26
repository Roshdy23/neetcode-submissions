class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<Integer>> mp = new HashMap<>();

        int n = strs.length;

        for(Integer i =0;i<n;  i++) {
            String temp = strs[i];
            char[] arr = temp.toCharArray();
            Arrays.sort(arr);
            temp = new String(arr);
            ArrayList<Integer> value = mp.get(temp);
            if(value != null){
            value.add(i);
            mp.put(temp, value);
            } else {
                value = new ArrayList<Integer>();
                value.add(i);
                mp.put(temp, value);
            }
        }

        List<List<String>> ls = new ArrayList<> ();

        mp.forEach((k, v) -> {
            List<String> templs = new ArrayList<> ();
            for(Integer i : v) {
                templs.add(strs[i]);
            }
            ls.add(templs);
        });

        return ls;
    }
}
