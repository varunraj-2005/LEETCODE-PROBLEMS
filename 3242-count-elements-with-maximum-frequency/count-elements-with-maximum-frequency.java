class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count=0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }int max=0;
        for(int i:m.keySet()){
            if(m.get(i)>max){
                count=0;
                count+=m.get(i);
                max=m.get(i);
            }
            else if(m.get(i)==max){
                count+=m.get(i);
            }
        }
        return count;
    }
}