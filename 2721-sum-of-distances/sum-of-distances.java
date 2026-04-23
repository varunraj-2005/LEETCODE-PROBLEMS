// class Solution {
//     public long[] distance(int[] nums) {
//         long[] ans = new long[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int a=0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j] && i!=j){
//                     a+=Math.abs(i-j);
//                 }
//             }
//             ans[i]=a;
//         }
//         return ans;
//     }
// }

import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        // Step 1: Store indices for each value
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        // Step 2: Process each group
        for (List<Integer> list : map.values()) {
            int size = list.size();
            long[] prefix = new long[size];
            
            // prefix sum of indices
            prefix[0] = list.get(0);
            for (int i = 1; i < size; i++) {
                prefix[i] = prefix[i - 1] + list.get(i);
            }
            
            for (int i = 0; i < size; i++) {
                int idx = list.get(i);
                
                long left = (long) i * idx - (i > 0 ? prefix[i - 1] : 0);
                long right = (prefix[size - 1] - prefix[i]) - (long)(size - i - 1) * idx;
                
                ans[idx] = left + right;
            }
        }
        
        return ans;
    }
}
