class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> l = new ArrayList<>();
        for(int i=1;i<=target[target.length-1];i++){
            l.add("Push");
            if(!contain(i,target)){
                l.add("Pop");
            }
        }
        return l;
        
    }
    public static boolean contain(int a,int[] b){
        for(int i=0;i<b.length;i++){
            if(a==b[i]){
                return true;
            }
        }
        return false;
    }
}