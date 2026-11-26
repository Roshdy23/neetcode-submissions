class Solution {

    static class Pair implements Comparable<Pair>{

        Integer first;
        Integer second;

        public Pair(Integer f, Integer s) {
            this.first = f;
            this.second = s;
        }

        public void setFirst(Integer f) {
            this.first =f;
        }

        public void setPair(Integer f, Integer s) {
            this.first = f;
            this.second =s;
        }

        @Override
        public int compareTo(Pair o) {
         return  Integer.compare(o.second, this.second);
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums){
            if(mp.containsKey(num) ) {
                Integer temp = mp.get(num);
                temp++;
                mp.put(num, temp);
            } else {
            mp.put(num, 1);
            }
        }

        List<Pair> ls = new ArrayList<>();

        mp.forEach((key, v) -> {

            // Pair tempPair = new Pair(key, v);
            ls.add(new Pair(key, v));
        });

        Collections.sort(ls);

        int []ans = new int[k];
        for(int i =0;i<k;i++)ans[i] = ls.get(i).first;
        return ans;
    }
}
