class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] a = new int[k];
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
       
        for(int j=0;j<k;j++){
             int max=0;
             int key=0;
            for(int i:m.keySet()){
            if(m.get(i)>max){
                max=m.get(i);
                key=i;
            }
        }
        a[j]=key;
        m.put(key,-1);
        }
        return a;
    }
}