class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int a=0;
        int b=0;
        for(int i:m.keySet()){
            a+=m.get(i)/2;
            b+=m.get(i)%2;
        }
        return new int[]{a,b};
    }
}