class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> o = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        for(int i:nums){
            if(i%2==0){
                e.add(i);
            }
            else{
                o.add(i);
            }
        }
        int ind=0;
        for(int i:e){
            nums[ind++]=i;
        }
        for(int i:o){
            nums[ind++]=i;
        }
        return nums;
    }
}