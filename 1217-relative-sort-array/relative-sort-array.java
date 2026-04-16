class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> a = new TreeMap<>();
        for(int i:arr1){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        int ans[] = new int[arr1.length];
        List<Integer> l = new ArrayList<>();
        int ind=0;
        for(int i:arr2){
            for(int j=0;j<a.get(i);j++){
                ans[ind++]=i;
            }
            a.put(i,-1);
        }
        for(int i:a.keySet()){
            if(a.get(i)!=-1){
                for(int j=0;j<a.get(i);j++){
                    ans[ind++]=i;
                }
            }
        }
        return ans;
    }
}