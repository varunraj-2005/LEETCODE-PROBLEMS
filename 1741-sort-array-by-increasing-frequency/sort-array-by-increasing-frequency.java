class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> m = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int[] a = new int[nums.length];
        int ind=0;
        for(int i=0;i<m.size();i++){
            int min=Integer.MAX_VALUE;
            int b=0;
            for(Map.Entry<Integer,Integer> e:m.entrySet()){
                if(e.getValue() != -1 && 
                  (e.getValue() < min || 
                  (e.getValue() == min && e.getKey() > b))){
                    min=e.getValue();
                    b=e.getKey();
                }
            }
            m.put(b,-1);
            for(int j=0;j<min;j++){
                a[ind++]=b;
            }
        }
        return a;
    }
}