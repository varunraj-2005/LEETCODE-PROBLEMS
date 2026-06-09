class Solution {
    public int candy(int[] r) {
        List<Integer> l = new ArrayList<>();
        int a = 0;
        for(int i=0;i<r.length;i++){
            if(i==0){
                l.add(1);
            }
            else if(r[i]>r[i-1]){
                l.add(l.get(i-1)+1);
            }
            else{
                l.add(1);
            }
        }
        for(int i=r.length-1;i>=0;i--){
            if(i==r.length-1){
                l.set(i,Math.max(1,l.get(i)));
            }
            else if(r[i]>r[i+1]){
                l.set(i,Math.max(l.get(i),(l.get(i+1)+1)));
            }
            else{
                l.set(i,Math.max(1,l.get(i)));
            }
        }
        for(int i:l){
            a+=i;
        }
        return a;
    }
}