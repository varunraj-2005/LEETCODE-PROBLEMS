class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int ans=-1;
        for(int i:m.keySet()){
            if(i==m.get(i)){
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}