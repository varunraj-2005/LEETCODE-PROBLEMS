class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        for(int i:m.keySet()){
            if(m.get(i)*2==nums.length) return i;
        }
        return 1;
    }
}