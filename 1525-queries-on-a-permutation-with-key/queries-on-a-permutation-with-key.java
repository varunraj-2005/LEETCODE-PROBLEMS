class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> l = new ArrayList<>();
        int[] ans = new int[queries.length];
        for(int i=1;i<=m;i++){
            l.add(i);
        }int ind=0;
        for(int i:queries){
            if(l.indexOf(i)==0){
                ans[ind++]=0;
                continue;
            }
            ans[ind++]=l.indexOf(i);
            l.remove(l.indexOf(i));
            l.add(0,i);
        }
        return ans;
    }
}