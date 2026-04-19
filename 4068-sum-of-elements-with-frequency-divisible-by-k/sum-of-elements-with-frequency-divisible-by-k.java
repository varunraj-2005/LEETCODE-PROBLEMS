class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int sum=0;
        for(int i:m.keySet()){
            if(m.get(i)%k==0){
                for(int j=0;j<m.get(i);j++){
                    sum+=i;
                }
            }
        }
        return sum;
    }
}