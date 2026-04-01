class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int i:m.keySet()){
            if(m.get(i)>(arr.length/4)){
                return i;
            }
        }
        return -1;
    }
}