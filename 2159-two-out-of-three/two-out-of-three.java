class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> l = new HashSet<>();
        Set<Integer> ll = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int i:nums1){
            l.add(i);
        }
        for(int i:nums2){
            if(l.contains(i) && !ans.contains(i)){
                ans.add(i);
            }
            else{
                ll.add(i);
            }
        }
        for(int i:nums3){
            if(l.contains(i) && !ans.contains(i)){
                ans.add(i);
            }
            else if(ll.contains(i) && !ans.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}