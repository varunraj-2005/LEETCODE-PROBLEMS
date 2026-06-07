class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> l = new HashSet<>();
        for(int i:nums){
            l.add(i);
            int a = 0;
            while(i!=0){
                a= (a*10)+(i%10);
                i/=10;
            }
            l.add(a);
        }
        return l.size();
    }
}