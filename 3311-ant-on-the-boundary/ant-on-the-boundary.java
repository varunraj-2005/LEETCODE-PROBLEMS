class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count=0;
        int b = 0;
        for(int i:nums){
            b+=i;
            if(b==0){
                count++;
            }
        }
        return count;
    }
}