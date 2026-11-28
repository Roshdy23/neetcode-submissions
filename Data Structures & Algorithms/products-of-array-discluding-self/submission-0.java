class Solution {
    public int[] productExceptSelf(int[] nums) {
        long cntZeros = Arrays.stream(nums).filter(n -> n == 0).count();
        if(cntZeros > 1) return new int[nums.length];
        int prod = Arrays.stream(nums).reduce(1,(c,e)-> e!= 0 ? c * e : c);
        return Arrays.stream(nums).map(n -> cntZeros == 1 ? (n == 0 ? prod : 0) : prod/n ).toArray();
    }
}  
