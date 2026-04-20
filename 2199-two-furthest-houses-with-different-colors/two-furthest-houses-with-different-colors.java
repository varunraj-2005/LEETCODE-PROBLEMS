class Solution {
    public int maxDistance(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(j-i > ans && nums[i]!=nums[j]){
                    ans=j-i;
                }
            }
        }
        return ans;
    }
}