class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr = Arrays.copyOf(nums,nums.length*2);
        int n = nums.length-1;
        for(int i=nums.length;i<arr.length;i++){
            arr[i]=nums[n--];
        }
        return arr;
    }
}