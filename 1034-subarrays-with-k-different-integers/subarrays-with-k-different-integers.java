class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return totalFruit(nums,k)-totalFruit(nums,k-1);
    }
    public int totalFruit(int[] f,int k) {
        Map<Integer,Integer> m = new HashMap<>();
        int left=0;
        int count=0;
        for(int right=0;right<f.length;right++){
            m.put(f[right],m.getOrDefault(f[right],0)+1);
            while(m.size()>k){
                m.put(f[left],m.get(f[left])-1);
                if(m.get(f[left])==0){
                    m.remove(f[left]);
                }
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}