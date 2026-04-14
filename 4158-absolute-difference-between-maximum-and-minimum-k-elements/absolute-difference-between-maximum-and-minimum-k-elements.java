class Solution {
    public int absDifference(int[] nums, int k) {
        int ans=0;
        int a=0,b=0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=nums.length-k;i--){
            a+=nums[i];
        }
        for(int i=0;i<k;i++){
            b+=nums[i];
        }
        ans=Math.abs(a-b);
        return ans;
    }
}