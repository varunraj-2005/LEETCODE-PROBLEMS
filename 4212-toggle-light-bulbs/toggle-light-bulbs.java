class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int[] a = new int[101];
        for(int i:bulbs){
            a[i]=a[i]+1;
        }
        List<Integer> l = new ArrayList<>();
        for(int i:bulbs){
            if(a[i]%2!=0 && !l.contains(i)){
                l.add(i);
            }
        }
        Collections.sort(l);
        return l;
    }
}