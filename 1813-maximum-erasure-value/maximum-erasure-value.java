// class Solution {
//     public int maximumUniqueSubarray(int[] nums) {
//         int ans=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             List<Integer> l = new ArrayList<>();
//             for(int j=i;j<nums.length;j++){
//                 if(l.contains(nums[j])){
//                     break;
//                 }
//                 l.add(nums[j]);
//             }
//             int sum=0;
//             for(int k:l){
//                 sum+=k;
//             }
//             if(sum>ans){
//                 ans=sum;
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       Set<Integer> s = new HashSet<>();
       int max=0,left=0,sum=0;
       for(int i=0;i<nums.length;i++){
        while(s.contains(nums[i])){
                s.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            s.add(nums[i]);
            sum+=nums[i];
            max=Math.max(max,sum);
       }
       return max;
    }
}