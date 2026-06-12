class Solution {
    public int trap(int[] h) {
        int[] left = new int[h.length];
        int[] right = new int[h.length];
        int water = 0 ;
        left[0]=h[0];
        for(int i=1;i<h.length;i++){
            left[i]=Math.max(left[i-1],h[i]);
        }
        right[h.length-1]=h[h.length-1];
        for(int i=h.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],h[i]);
        }
        for(int i=0;i<h.length;i++){
            water+=Math.min(left[i],right[i])-h[i];
        }
        return water;
    }
}