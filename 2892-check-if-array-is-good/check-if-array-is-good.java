class Solution {
    public boolean isGood(int[] nums) {
        if(nums.length==1){
            return false;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1 && i!=nums.length-1){
                return false;
            }
            if(i==nums.length-1){
                if(nums[i]!=nums[i-1]){
                    return false;
                }
            }
        }
        return true;
    }
}